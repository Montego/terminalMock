package com.terminalmock.test.services.entityServices;

import com.terminalmock.test.entities.entity.Application;
import com.terminalmock.test.entities.entity.Person;
import com.terminalmock.test.entities.entity.PersonInfo;
import com.terminalmock.test.repositories.entityrepo.ApplicationRepo;
import com.terminalmock.test.repositories.entityrepo.PersonInfoRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService {
    private final ApplicationRepo applicationRepo;
    private final PersonInfoRepo personInfoRepo;


    public ApplicationService(ApplicationRepo application, PersonInfoRepo personInfoRepo) {
        this.applicationRepo = application;
        this.personInfoRepo = personInfoRepo;
    }

    public Application getOne(long id) {
        return applicationRepo.findById(id).orElse(null);
    }

    public List<Application> getAll() {
        return applicationRepo.findAll();
    }

    public void save(Application application){
        applicationRepo.save(application);
    }


    public void saveWithPersonConnect(Application application, Long id){
        PersonInfo personInfo = personInfoRepo.findById(id).orElse(null);
        Person person = personInfo.getPerson();
        application.setPerson(person);
        applicationRepo.save(application);
    }

//    public Application getApplicationById(long id) {
//        return applicationRepo.findById(id).orElse(null);
//    }

    public void delete(Long id) {
        applicationRepo.deleteById(id);
    }
}
