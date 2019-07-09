package com.terminalmock.test.controllers;

import com.terminalmock.test.dto.ApplicationShortDto;
import com.terminalmock.test.entities.entity.Application;
import com.terminalmock.test.repositories.entityrepo.ApplicationRepo;
import com.terminalmock.test.repositories.entityrepo.PersonRepo;
import com.terminalmock.test.services.dtoServices.ApplicationShortDtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/profile")
public class ApplicationController {

    @Autowired
    ApplicationShortDtoService applicationShortDtoService;

    @Autowired
    ApplicationRepo applicationRepo;

    @Autowired
    PersonRepo personRepo;

    @GetMapping("/getEmptyApplication")
    public Application getEmptyApplication() {
        return new Application(true);
    }

    @GetMapping("/applicationByPerson/{id}")
    public List<ApplicationShortDto> applicationByPerson(@PathVariable("id") Long id) {
        return applicationShortDtoService.getPersonApplications(personRepo.findById(id).get());
    }

    @PostMapping("/application")
    public Application applicationByPerson(@RequestBody Application application) {
        return applicationRepo.save(application);

    }

}
