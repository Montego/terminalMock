package com.terminalmock.test.services.entityServices;

import com.terminalmock.test.dto.ApplicationTableDto;
import com.terminalmock.test.dto.PersonTableDto;
import com.terminalmock.test.entities.entity.Application;
import com.terminalmock.test.entities.entity.Person;
import com.terminalmock.test.entities.entity.PersonInfo;
import com.terminalmock.test.repositories.entityrepo.PersonInfoRepo;
import com.terminalmock.test.repositories.entityrepo.PersonRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    public List<PersonTableDto> getAllPersonTableDto() {
        List<PersonInfo> persons = personInfoRepo.findAll();

        List<PersonTableDto> personsDto = new ArrayList<>();
        for(int i =0; i<persons.size(); i++){
//            List<Application> applications = persons.get(i).getPerson().getApplications();

            PersonTableDto personTableDto = new PersonTableDto(
                    persons.get(i).getId(),
                    persons.get(i).getTab_personal_lastname(),
                    persons.get(i).getTab_personal_firstname(),
                    persons.get(i).getTab_personal_middlename(),
                    persons.get(i).getTab_personal_birthDate()
//                    applications.get(i).getApplication_number()
            );
            personsDto.add(personTableDto);
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

    public void save(Person person){
        person_Repo.save(person);
    }

    public void delete(Long id) {
        person_Repo.deleteById(id);
    }
}
