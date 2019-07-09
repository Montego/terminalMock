package com.terminalmock.test.controllers;

import com.terminalmock.test.dto.ApplicationShortDto;
import com.terminalmock.test.repositories.entityrepo.PersonRepo;
import com.terminalmock.test.services.dtoServices.ApplicationShortDtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/profile")
public class ApplicationController {

    @Autowired
    ApplicationShortDtoService applicationShortDtoService;

    @Autowired
    PersonRepo personRepo;

    @GetMapping("/applicationByPerson/{id}")
    public List<ApplicationShortDto> applicationByPerson(@PathVariable("id") Long id) {

        return applicationShortDtoService.getPersonApplications(personRepo.findById(id).get());
    }
}
