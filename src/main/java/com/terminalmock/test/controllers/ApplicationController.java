package com.terminalmock.test.controllers;

import com.terminalmock.test.dto.ApplicationShortDto;
import com.terminalmock.test.dto.ApplicationTableDto;
import com.terminalmock.test.dto.DocumentDto;
import com.terminalmock.test.entities.entity.Application;
import com.terminalmock.test.repositories.entityrepo.ApplicationRepo;
import com.terminalmock.test.repositories.entityrepo.PersonRepo;
import com.terminalmock.test.services.dtoServices.ApplicationNumberDtoService;
import com.terminalmock.test.services.dtoServices.ApplicationShortDtoService;
import com.terminalmock.test.services.dtoServices.ApplicationTableDtoService;
import com.terminalmock.test.services.dtoServices.FillDocumentsDtoService;
import com.terminalmock.test.services.entityServices.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profile")
public class ApplicationController {

    @Autowired
    ApplicationShortDtoService applicationShortDtoService;
    @Autowired
    ApplicationTableDtoService applicationTableDtoService;
    @Autowired
    ApplicationNumberDtoService applicationNumberDtoService;
    @Autowired
    FillDocumentsDtoService fillDocumentsDtoService;
    @Autowired
    ApplicationService applicationService;
    @Autowired
    ApplicationRepo applicationRepo;

    @Autowired
    PersonRepo personRepo;

//    @GetMapping("/getEmptyApplication")
//    public Application getEmptyApplication() {
//        return new Application(true);
//    }


//    @GetMapping("/applicationByPerson/{id}")
//    public Set<>

//    @GetMapping("/applicationByPerson/{id}")
//    public List<ApplicationShortDto> applicationByPerson(@PathVariable("id") Long id) {
//        return applicationShortDtoService.getPersonApplications(personRepo.findById(id).get());
//    }

    @PostMapping("/application")
    public Application saveApplication(@RequestBody Application application) {
        return applicationRepo.save(application);
    }

//
//    @GetMapping("/ways")
//    public List<> getApplicationById(@PathVariable Long id) {
//        return applicationService.getOne(id);
//    }

    @GetMapping("/applicationById/{id}")
    public Application getApplicationById(@PathVariable Long id) {
        System.out.println("appl by id");
        return applicationService.getOne(id);
    }

    @PostMapping("/application/{id}")
    public String saveApplWithPersonConnect(
            @RequestBody Application application,
            @PathVariable Long id) {
        applicationService.saveWithPersonConnect(application,id);
        return "Сохранено";

    }

    @GetMapping("/applicationTable/{id}")
    public List<ApplicationTableDto> getApplicationsTableDto(@PathVariable Long id){
        return applicationTableDtoService.getApplicationsTableDto(id);
    }

    @GetMapping("/applicationNumber/{id}")
    public String getApplicationNumberByPersonInfo(@PathVariable Long id) {
        return applicationNumberDtoService.getApplicationNumberByPersonInfo(id);
    }

    @GetMapping("/FillDocuments/{id}")
    public List<DocumentDto> getDocumentsByPersonInfoId(@PathVariable Long id) {
        return fillDocumentsDtoService.getFillDocumentsByPersonInfo(id);
    }

}
