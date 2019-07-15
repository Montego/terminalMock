package com.terminalmock.test.services.entityServices;

import com.terminalmock.test.entities.entity.Application;
import com.terminalmock.test.entities.entity.Person;
import com.terminalmock.test.entities.entity.PersonInfo;
import com.terminalmock.test.repositories.entityrepo.PersonInfoRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class PersonInfoService {
    private final PersonInfoRepo personInfoRepo;


    public PersonInfoService(PersonInfoRepo personInfoRepo) {
        this.personInfoRepo = personInfoRepo;

    }

    public PersonInfo getOne(long id) {
        return personInfoRepo.findById(id).orElse(null);
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

}
