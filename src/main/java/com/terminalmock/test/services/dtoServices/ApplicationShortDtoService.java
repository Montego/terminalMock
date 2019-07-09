package com.terminalmock.test.services.dtoServices;

import com.terminalmock.test.dto.ApplicationConverter;
import com.terminalmock.test.dto.ApplicationShortDto;
import com.terminalmock.test.entities.entity.Application;
import com.terminalmock.test.entities.entity.Person;
import com.terminalmock.test.repositories.entityrepo.ApplicationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ApplicationShortDtoService {

    @Autowired
    ApplicationRepo applicationRepo;

    public ArrayList<ApplicationShortDto> getPersonApplications(Person person){

        ArrayList<Application> arList = applicationRepo.findAllByPerson(person);
        ArrayList<ApplicationShortDto> result = new ArrayList<>();

        for(Application app:arList){
            result.add(ApplicationConverter.EntityToShortDto(app));
        }

        return result;
    }

}
