package com.terminalmock.test.services.dtoServices;

import com.terminalmock.test.dto.ConditionsDto;
import com.terminalmock.test.dto.ResultAplDto;
import com.terminalmock.test.entities.entity.Application;
import com.terminalmock.test.entities.entity.ChoosenWizard;
import com.terminalmock.test.entities.entity.Person;
import com.terminalmock.test.entities.entity.PersonInfo;
import com.terminalmock.test.entities.view.Wizard;
import com.terminalmock.test.repositories.entityrepo.ChoosenWizardRepo;
import com.terminalmock.test.repositories.entityrepo.PersonInfoRepo;
import com.terminalmock.test.services.entityServices.ChoosenWizardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ConditionsDtoService {
    @Autowired
    PersonInfoRepo personInfoRepo;
    @Autowired
    ChoosenWizardRepo choosenWizardRepo;

    public ResultAplDto get (long id){
        PersonInfo personInfo = personInfoRepo.findById(id).orElse(null);
        String fullname = personInfo.getTab_personal_lastname() + " " + personInfo.getTab_personal_firstname() + " " + personInfo.getTab_personal_middlename();
        String appl_number = "С" + personInfo.getId();
        Person person = personInfo.getPerson();
        System.out.println(person.getId());
        Application application = person.getApplication();
        List<ChoosenWizard> choosenWizards = choosenWizardRepo.findAllByApplication(
                application
        );

        ResultAplDto resultAplDto = new ResultAplDto(
//                application.getApplication_number(),
                appl_number,
                fullname,
                LocalDate.now(),
                choosenWizards
        );
        return resultAplDto;
    }




}
