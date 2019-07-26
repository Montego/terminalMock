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

    public List<ApplicationTableDto> getApplicationsTableDto(long id) {
        PersonInfo personInfo = personInfoRepo.findById(id).orElse(null);
        Person person = personInfo.getPerson();

        Application application = person.getApplication();
        List<ApplicationTableDto> applicationTableDtos = new ArrayList<>();
        if(application!= null){
            ApplicationTableDto applicationTableDto = new ApplicationTableDto(
                    application.getId(),
                    application.getApplication_person_name(),
                    application.getApplication_number(),
                    application.getApplication_date(),
                    application.getApplication_selectedDeliveryType(),
                    application.getPerson_application().getAcceptedPerson(),
                    application.getSaved()
            );
            applicationTableDtos.add(applicationTableDto);
        }else {
            ApplicationTableDto applicationTableDto = new ApplicationTableDto(
                    0l,
                    "",
                    "",
                    null,
                    null,
                    "Не утверждено",
                    "Не сохранено");
        }


//        for (int i = 0; i < (applications).size(); i++) {
//            ApplicationTableDto applicationTableDto = new ApplicationTableDto(
//                    applications.get(i).getId(),
//                    applications.get(i).getApplication_person_name(),
//                    applications.get(i).getApplication_number(),
//                    applications.get(i).getApplication_date(),
//                    applications.get(i).getApplication_selectedDeliveryType(),
//                    applications.get(i).getPerson().getAcceptedPerson(),
//                    applications.get(i).getSaved()
//            );


        return applicationTableDtos;
    }
}
