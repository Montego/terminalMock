package com.terminalmock.test.services.entityServices;

import com.terminalmock.test.entities.entity.Application;
import com.terminalmock.test.entities.entity.Person;
import com.terminalmock.test.entities.entity.PersonInfo;
import com.terminalmock.test.entities.entity.address.AddressCell;
import com.terminalmock.test.entities.entity.address.AddressCellBasedDto;
import com.terminalmock.test.entities.entity.address.PersonAddress;
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


    public PersonInfoService(PersonInfoRepo personInfoRepo) {
        this.personInfoRepo = personInfoRepo;

    }

    public PersonInfo getOne(long id) {
        PersonInfo response = personInfoRepo.findById(id).orElse(null);
        if (response != null){
            addAddresses(response);
            addAddressesDto(response);
        }
        return response;
    }

    public List<PersonInfo> getAll() {
        return personInfoRepo.findAll();
    }

    public Person getPersonByPersonInfo(long id){
        PersonInfo personInfo = personInfoRepo.findById(id).orElse(null);
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

}
