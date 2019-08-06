package com.terminalmock.test.services.entityServices;

import com.terminalmock.test.entities.entity.Application;
import com.terminalmock.test.entities.entity.Person;
import com.terminalmock.test.entities.entity.PersonInfo;
import com.terminalmock.test.entities.entity.PersonParent;
import com.terminalmock.test.entities.entity.address.*;
import com.terminalmock.test.entities.enums.AddressType;
import com.terminalmock.test.repositories.entityrepo.PersonInfoRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
            return personInfo.getPerson();
        } else {
            return null;
        }
    }

    public Application getApplicationsByPersonInfo(long id){
        PersonInfo personInfo = personInfoRepo.findById(id).orElse(null);
        if(personInfo != null){
            return personInfo.getPerson().getApplication();
        }else {
            return null;
        }
    }
//TODO check return
    public String getApplicationPersonName(long id){
        PersonInfo personInfo = personInfoRepo.findById(id).orElse(null);
        String answer;
        if(personInfo != null) {
            if(personInfo.getTab_personal_lastname()!= null){
               return answer = personInfo.getTab_personal_lastname()+ " " +
                        personInfo.getTab_personal_firstname() +
                        " " + personInfo.getTab_personal_middlename();
            }else{
                return null;
            }
        }else{
            return null;
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
        reg.setAddressType(REG_ADDRESS);
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
        handlePersonAddresses(person);
        handlePersonParentAddress(person);
    }

    private void handlePersonAddresses(Person person){
        ArrayList<AddressCellBasedDto> dtos = new ArrayList<>();
        if (person.getPerson_info() != null && person.getPerson_info().getAddresses() != null){
            if (person.getPerson_info().getAddresses().size()<3){
                addEmptyAddressesForPerson(person);
            }
            for (PersonAddress address: person.getPerson_info().getAddresses()){
                AddressCellBasedDto dto = convertAdrToAdrDto(address);
                dto.setAddressType(address.getAddressType());
                dtos.add(dto);
            }
        }
        person.getPerson_info().setAddressesDto(dtos);
    }

    private void handlePersonParentAddress(Person person){
        if (person.getParents_info() != null){
            for (PersonParent parent: person.getParents_info()){
                if (parent.getAddress() != null){
                    AddressCellBasedDto parentDto = convertAdrToAdrDto(parent.getAddress());
                    parentDto.setAddressType(parent.getAddress().getAddressType());
                    parent.setAddressDto(parentDto);
                } else {
                    PersonParentAddress model = new PersonParentAddress();
                    AddressCellBasedDto parentDto = convertAdrToAdrDto(model);
                    parentDto.setAddressType(FACT_ADDRESS);
                    parent.setAddressDto(parentDto);
                }
            }
        }
    }

    private void addEmptyAddressesForPerson(Person person) {
        List<AddressType> types = new ArrayList<>();
        types.add(FACT_ADDRESS);
        types.add(REG_ADDRESS);
        types.add(TEMP_REG_ADDRESS);
        List<AddressType> personTypes = person.getPerson_info().getAddresses().stream()
                .map(Address::getAddressType).collect(Collectors.toList());
        types.removeAll(personTypes);
        for (AddressType type : types){
            PersonAddress model = new PersonAddress();
            model.setAddressType(type);
            person.getPerson_info().getAddresses().add(model);
        }
    }

    public AddressCellBasedDto getParentAddressDto() {
        PersonParentAddress address = new PersonParentAddress();
        address.setAddressType(FACT_ADDRESS);
        return convertAdrToAdrDto(address);
    }
}
