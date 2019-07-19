package com.terminalmock.test.services.entityServices;

import com.terminalmock.test.dto.PersonTableDto;
import com.terminalmock.test.entities.entity.Person;
import com.terminalmock.test.entities.entity.PersonInfo;
import com.terminalmock.test.entities.entity.PersonParent;
import com.terminalmock.test.entities.entity.User;
import com.terminalmock.test.entities.enums.AddressType;
import com.terminalmock.test.repositories.entityrepo.PersonInfoRepo;
import com.terminalmock.test.repositories.entityrepo.PersonRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.terminalmock.test.services.entityServices.AddressService.convertAdrDtoToAdr;

@Service
public class PersonService {
    private final PersonRepo person_Repo;
    private final PersonInfoRepo personInfoRepo;

    public PersonService(PersonRepo person_Repo, PersonInfoRepo personInfoRepo) {
        this.person_Repo = person_Repo;
        this.personInfoRepo = personInfoRepo;
    }

    public Person getOne(long id) {
        return person_Repo.findById(id).orElse(null);
    }

    public List<Person> getAll() {
        return person_Repo.findAll();
    }

    public List<PersonTableDto> getAllPersonTableDto(User user) {
        List<PersonInfo> persons = personInfoRepo.findAllByModifiedBy(user.getAlias());

        List<PersonTableDto> personsDto = new ArrayList<>();

        for (PersonInfo person : persons){
            PersonTableDto dto = new PersonTableDto();
            dto.setId(person.getId());
            dto.setTab_personal_lastname(person.getTab_personal_lastname());
            dto.setTab_personal_firstname(person.getTab_personal_firstname());
            dto.setTab_personal_middlename(person.getTab_personal_middlename());
            dto.setTab_personal_birthDate(person.getTab_personal_birthDate());
            dto.setResultAcceptPerson(person.getPerson().getAcceptedPerson());
            dto.setSaved(person.getPerson().getSaved());
            personsDto.add(dto);
        }

        return personsDto;
    }


//    public List<ApplicationTableDto> getAllApplicationTableDto() {
//        List<PersonInfo> persons= personInfoRepo.findAll();
//        List<ApplicationTableDto> applicationsTableDto = new ArrayList<>();
//        for(int i =0; i<persons.size(); i++){
//            ApplicationTableDto applicationTableDto = new ApplicationTableDto(
//                    persons.get(i).getId(),
//                    persons.get(i).getTab_personal_name()
////                    persons.get(i).getApplication_number(),
////                    persons.get(i).getApplication_date(),
////                    persons.get(i).getApplication_selectedDeliveryType().getName(),
////                    persons.get(i).isBudget()
//            );
//            applicationsTableDto.add(applicationTableDto);
//        }
//        return applicationsTableDto;
//    }

//    public List<ApplicationDto> getAllApplicationDto() {
//        List<Person> persons= person_Repo.findAll();
//        List<ApplicationDto> applicationsDto = new ArrayList<>();
//        for(int i = 0; i<persons.size(); i++){
//            ApplicationDto applicationDto = new ApplicationDto(
//
//            );
//            applicationsDto.add(applicationDto);
//        }
//        return applicationsDto;
//    }

    public void save(Person person, User user){
//        person.getPerson_info();
        person.getPerson_info().setModifiedBy(user.getAlias());
        updateAddresses(person.getPerson_info());
        person.getParents_info().forEach(this::updateAddresses);
        person_Repo.save(person);
    }

    public void delete(Long id) {
        person_Repo.deleteById(id);
    }


    private void updateAddresses(PersonInfo cp){

        cp.getAddresses().forEach( adr ->
                {
                    AddressType adType = adr.getAddressType();
                    convertAdrDtoToAdr(cp.getAddressesDto().stream().filter(adrDto -> adType.getId().equals(adrDto.getAddressType().getId())).findFirst().orElseGet(null), adr);
                }
        );
    }

    private void updateAddresses(PersonParent cp){

        cp.getAddresses().forEach( adr ->
                {
                    AddressType adType = adr.getAddressType();
                    convertAdrDtoToAdr(cp.getAddressesDto().stream().filter(adrDto -> adType.getId().equals(adrDto.getAddressType().getId())).findFirst().orElseGet(null), adr);
                }
        );
    }

}
