package com.terminalmock.test.controllers;

import com.terminalmock.test.dto.DocumentDto;
import com.terminalmock.test.dto.ResultAplDto;
import com.terminalmock.test.entities.entity.Application;
import com.terminalmock.test.entities.view.Wizard;
import com.terminalmock.test.services.dtoServices.ApplicationNumberDtoService;
import com.terminalmock.test.services.dtoServices.ApplicationTableDtoService;
import com.terminalmock.test.services.dtoServices.ConditionsDtoService;
import com.terminalmock.test.services.dtoServices.FillDocumentsDtoService;
import com.terminalmock.test.services.entityServices.ApplicationService;
import com.terminalmock.test.services.viewServices.WizardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profile")
public class ApplicationController {

    private final ConditionsDtoService conditionsDtoService;
    private final WizardService wizardService;
    private final ApplicationTableDtoService applicationTableDtoService;
    private final ApplicationNumberDtoService applicationNumberDtoService;
    private final FillDocumentsDtoService fillDocumentsDtoService;
    private final ApplicationService applicationService;

    @Autowired
    public ApplicationController(ConditionsDtoService conditionsDtoService,
                                 WizardService wizardService,
                                 ApplicationTableDtoService applicationTableDtoService,
                                 ApplicationNumberDtoService applicationNumberDtoService,
                                 FillDocumentsDtoService fillDocumentsDtoService,
                                 ApplicationService applicationService) {
        this.conditionsDtoService = conditionsDtoService;
        this.wizardService = wizardService;
        this.applicationTableDtoService = applicationTableDtoService;
        this.applicationNumberDtoService = applicationNumberDtoService;
        this.fillDocumentsDtoService = fillDocumentsDtoService;
        this.applicationService = applicationService;
    }


    @PostMapping("/application")
    public Application saveApplication(@RequestBody Application application) {
        return applicationService.save(application);
    }

    @GetMapping("/applicationById/{id}")
    public Application getApplicationById(@PathVariable Long id) {
        System.out.println("appl by id");
        return applicationService.getOne(id);
    }

    @PostMapping("/application/{id}")
    public String saveApplWithPersonConnect(
            @RequestBody Application application,
            @PathVariable Long id) {
        applicationService.saveWithPersonConnect(application, id);
        return "Сохранено";

    }


    @GetMapping("/applicationNumber/{id}")
    public String getApplicationNumberByPersonInfo(@PathVariable Long id) {
        return applicationNumberDtoService.getApplicationNumberByPersonInfo(id);
    }

    @GetMapping("/FillDocuments/{id}")
    public List<DocumentDto> getDocumentsByPersonInfoId(@PathVariable Long id) {
        return fillDocumentsDtoService.getFillDocumentsByPersonInfo(id);
    }

    @GetMapping("/conditions/{id}")
    public ResultAplDto get(@PathVariable Long id) {
        return conditionsDtoService.get(id);
    }

    @GetMapping("/fullConditions")
    public List<Wizard> getAll() {
        return wizardService.getAll();
    }

}
