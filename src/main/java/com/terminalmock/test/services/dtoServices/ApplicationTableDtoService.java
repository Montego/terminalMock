package com.terminalmock.test.services.dtoServices;

import com.terminalmock.test.dto.ApplicationTableDto;
import com.terminalmock.test.entities.entity.Application;
import com.terminalmock.test.entities.entity.PersonInfo;
import com.terminalmock.test.repositories.entityrepo.ApplicationRepo;
import com.terminalmock.test.repositories.entityrepo.PersonInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationTableDtoService {
    @Autowired
    ApplicationRepo applicationRepo;
    @Autowired
    PersonInfoRepo personInfoRepo;

    public ApplicationTableDto getApplicationsTableDto(long id) {
        PersonInfo personInfo = personInfoRepo.findById(id).orElse(null);
        Application application;
        if (personInfo != null) {
            application = personInfo.getPerson().getApplication();
        } else {
            application = null;
        }
        ApplicationTableDto applicationTableDto;
        if (application != null) {
            applicationTableDto = new ApplicationTableDto(
                    application.getId(),
                    application.getApplication_person_name(),
                    application.getApplication_number(),
                    application.getApplication_date(),
                    application.getApplication_selectedDeliveryType(),
                    application.getPerson().getAcceptedPerson(),
                    application.getSaved()
            );
        } else {
            applicationTableDto = new ApplicationTableDto(
                    0l,
                    "",
                    "",
                    null,
                    null,
                    "Не утверждено",
                    "Не сохранено");
        }

        return applicationTableDto;
    }
}
