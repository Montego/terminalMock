package com.terminalmock.test.services.dtoServices;

import com.terminalmock.test.entities.entity.Application;
import com.terminalmock.test.entities.entity.PersonInfo;
import com.terminalmock.test.repositories.entityrepo.ApplicationRepo;
import com.terminalmock.test.repositories.entityrepo.PersonInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationNumberDtoService {
    @Autowired
    ApplicationRepo applicationRepo;
    @Autowired
    PersonInfoRepo personInfoRepo;

    public String getApplicationNumberByPersonInfo(long id){
        PersonInfo personInfo = personInfoRepo.findById(id).orElse(null);
        List<Application> applications = personInfo.getPerson().getApplications();
        return applications.get(0).getApplication_number();
    }

}
