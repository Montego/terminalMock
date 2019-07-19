package com.terminalmock.test.services.entityServices;

import com.terminalmock.test.entities.entity.Application;
import com.terminalmock.test.entities.entity.Person;
import com.terminalmock.test.entities.entity.PersonInfo;
import com.terminalmock.test.entities.entity.PersonParent;
import com.terminalmock.test.entities.entity.address.AddressCell;
import com.terminalmock.test.entities.entity.address.AddressCellBasedDto;
import com.terminalmock.test.entities.entity.address.PersonAddress;
import com.terminalmock.test.entities.entity.address.PersonParentAddress;
import com.terminalmock.test.entities.enums.AddressType;
import com.terminalmock.test.repositories.entityrepo.PersonInfoRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.terminalmock.test.services.entityServices.AddressService.convertAdrDtoToAdr;
import static com.terminalmock.test.services.entityServices.AddressService.convertAdrToAdrDto;

@Service
public class PersonInfoService {
    private final PersonInfoRepo personInfoRepo;
    private static final AddressType REG_ADDRESS = new AddressType(0,"Адрес регистрации");
    private static final AddressType FACT_ADDRESS = new AddressType(1, "Адрес фактический");
    private static final AddressType TEMP_REG_ADDRESS = new AddressType(2, "Адрес временной регистрации");


    public PersonInfoService(PersonInfoRepo personInfoRepo) {
        this.personInfoRepo = personInfoRepo;

    }

    public PersonInfo getOne(long id) {
        PersonInfo response = personInfoRepo.findById(id).orElse(null);
        if (response != null){
            handleAddresses(response.getPerson());
        }
        return response;
    }

    public List<PersonInfo> getAll() {
        return personInfoRepo.findAll();
    }

    public Person getPersonByPersonInfo(long id){
        PersonInfo personInfo = personInfoRepo.findById(id).orElse(null);
        if (personInfo != null){
            handleAddresses(personInfo.getPerson());
        }
        return personInfo.getPerson();
    }

    public Application getApplicationsByPersonInfo(long id){
        PersonInfo personInfo = personInfoRepo.findById(id).orElse(null);
        Person person = personInfo.getPerson();
        return person.getApplication();
    }

    public String getApplicationPersonName(long id){
        PersonInfo personInfo = personInfoRepo.findById(id).orElse(null);
        return personInfo.getTab_personal_lastname() + " " + personInfo.getTab_personal_firstname() + " " + personInfo.getTab_personal_middlename();
    }

    private void  addAddressesDto(PersonInfo cp){
        //convertAdrToAdrDto
        List<AddressCellBasedDto> dtos = new ArrayList<>();
        for (PersonAddress address : cp.getAddresses()){
            AddressCellBasedDto dto = convertAdrToAdrDto(address);
            dto.setAddressSearchObj(new AddressCell(null,null,address.getAddressTxt()));
            dtos.add(dto);
        }
        cp.setAddressesDto(dtos);
    }

    private void addAddresses(PersonInfo cp){
        if (cp.getAddresses().isEmpty()){
            PersonAddress reg = new PersonAddress();
            reg.setPerson(cp);
            reg.setAddressType(new AddressType(0,"Адрес регистрации"));

            PersonAddress fac = new PersonAddress();
            fac.setPerson(cp);
            fac.setAddressType(new AddressType(1, "Адрес фактический"));

            PersonAddress tem = new PersonAddress();
            tem.setPerson(cp);
            tem.setAddressType(new AddressType(2, "Адрес временной регистрации"));

            cp.setAddresses(Arrays.asList(reg,fac,tem));
        }
    }

    private void updateAddresses(PersonInfo cp){

        cp.getAddresses().forEach( adr ->
                {
                    AddressType adType = adr.getAddressType();
                    convertAdrDtoToAdr(cp.getAddressesDto().stream().filter(adrDto -> adType.getId().equals(adrDto.getAddressType().getId())).findFirst().orElseGet(null), adr);
                }
        );
    }

    public List<AddressCellBasedDto> getAddressesDto(){
        List<PersonAddress> personAddresses = new ArrayList<>();

        PersonAddress fac = new PersonAddress();
        fac.setAddressType(FACT_ADDRESS);
        personAddresses.add(fac);

        PersonAddress reg = new PersonAddress();
        fac.setAddressType(REG_ADDRESS);
        personAddresses.add(reg);

        PersonAddress tempreg = new PersonAddress();
        tempreg.setAddressType(TEMP_REG_ADDRESS);
        personAddresses.add(tempreg);

        return convertListPersonAddressesToListAddressCellBasedDto(personAddresses);
    }

    private List<AddressCellBasedDto>  convertListPersonAddressesToListAddressCellBasedDto(List<PersonAddress> addresses){
        List<AddressCellBasedDto> dtos = new ArrayList<>();
        for (PersonAddress address : addresses){
            AddressCellBasedDto dto = convertAdrToAdrDto(address);
            dto.setAddressSearchObj(new AddressCell(null,null,address.getAddressTxt()));
            dtos.add(dto);
        }
        return dtos;
    }

    private void handleAddresses(Person person){
        ArrayList<AddressCellBasedDto> dtos = new ArrayList<>();
        if (person.getPerson_info() != null && person.getPerson_info().getAddresses() != null){
            for (PersonAddress address: person.getPerson_info().getAddresses()){
                AddressCellBasedDto dto = convertAdrToAdrDto(address);
                dto.setAddressType(address.getAddressType());
                dtos.add(dto);
            }
        }
        person.getPerson_info().setAddressesDto(dtos);

        ArrayList<AddressCellBasedDto> parentDtos = new ArrayList<>();
        if (person.getParents_info() != null){
            for (PersonParent parent: person.getParents_info()){
                if (parent.getAddresses() != null){
                    for (PersonParentAddress parentAddress: parent.getAddresses()){
                        AddressCellBasedDto parentDto = convertAdrToAdrDto(parentAddress);
                        parentDto.setAddressType(parentAddress.getAddressType());
                        parentDtos.add(parentDto);
                    }
                    parent.setAddressesDto(parentDtos);
                }
            }
        }
    }

}
