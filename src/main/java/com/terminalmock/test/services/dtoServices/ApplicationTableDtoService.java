package com.terminalmock.test.services.dtoServices;

import com.terminalmock.test.dto.ApplicationTableDto;
import com.terminalmock.test.entities.entity.Application;
import com.terminalmock.test.entities.entity.Person;
import com.terminalmock.test.entities.entity.PersonInfo;
import com.terminalmock.test.repositories.entityrepo.ApplicationRepo;
import com.terminalmock.test.repositories.entityrepo.PersonInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApplicationTableDtoService {
    @Autowired
    ApplicationRepo applicationRepo;
    @Autowired
    PersonInfoRepo personInfoRepo;

//    public List<ApplicationTableDto> getAll(Long id) {
//
//        List<>
//        return person_Repo.findAll();
//    }

    public List<ApplicationTableDto> getApplicationsTableDto(long id) {
        PersonInfo personInfo = personInfoRepo.findById(id).orElse(null);
        Person person = null;

        try{
             person = personInfo.getPerson();
        }catch (NullPointerException e){
            System.out.println("person null");
            List<ApplicationTableDto> empty = new ArrayList<>();
            return empty;
        }
//        Person person = personInfo.getPerson();

        List<Application> applications = person.getApplications();
        List<ApplicationTableDto> applicationTableDtos = new ArrayList<>();

//        ApplicationTableDto applicationTableDto = new ApplicationTableDto();
//        if(applicationRepo.findById())
        for (int i = 0; i < (applications).size(); i++) {
            ApplicationTableDto applicationTableDto = new ApplicationTableDto(
                    applications.get(i).getId(),
                    applications.get(i).getApplication_person_name(),
                    applications.get(i).getApplication_number(),
                    applications.get(i).getApplication_date(),
                    applications.get(i).getApplication_selectedDeliveryType(),
                    applications.get(i).getPerson().getAcceptedPerson()
            );
            applicationTableDtos.add(applicationTableDto);
        }
        return applicationTableDtos;
    }
}
