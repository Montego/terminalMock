package com.terminalmock.test.controllers;


import com.terminalmock.test.dto.PersonTableDto;
import com.terminalmock.test.entities.entity.Application;
import com.terminalmock.test.entities.entity.Person;
import com.terminalmock.test.entities.entity.PersonInfo;
import com.terminalmock.test.entities.entity.User;
import com.terminalmock.test.entities.view.Wizard;
import com.terminalmock.test.model.comparison.SearchParams;
import com.terminalmock.test.services.SearchPersonInfoSvc;
import com.terminalmock.test.services.dtoServices.ConditionsDtoService;
import com.terminalmock.test.services.entityServices.PersonInfoService;
import com.terminalmock.test.services.entityServices.PersonService;
import com.terminalmock.test.services.viewServices.WizardService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;
import javax.websocket.server.PathParam;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    ConditionsDtoService conditionsDtoService;
    @Autowired
    WizardService wizardService;
    private final PersonService personService;
    private final PersonInfoService personInfoService;
    private final SearchPersonInfoSvc searchPersonInfoSvc;

    @Autowired
    public ProfileController(PersonService personService, PersonInfoService personInfoService, SearchPersonInfoSvc searchPersonInfoSvc) {
        this.personService = personService;
        this.personInfoService = personInfoService;
        this.searchPersonInfoSvc = searchPersonInfoSvc;
    }


    @PostMapping("/search/")
    public List<PersonTableDto> searching(@RequestBody SearchParams params, HttpServletRequest request) {
        return searchPersonInfoSvc.searchMedCerts(params, request);
    }

    @GetMapping("/persons")
    public List<Person> getListPerson() {
        return personService.getAll();
    }

    @GetMapping("/personsTable")
    public List<PersonTableDto> getAllPersonTableDto(@AuthenticationPrincipal User user) {
        return personService.getAllPersonTableDto(user);
    }

    @GetMapping("/personByPersonInfo/{id}")
    public Person getPersonByPersonInfo(@PathVariable Long id) {
        return personInfoService.getPersonByPersonInfo(id);
    }

    @GetMapping("/getApplicationsByPersonInfo/{id}")
    public Application getApplicationsByPersonInfo(@PathVariable Long id) {
        return personInfoService.getApplicationsByPersonInfo(id);
    }

    @GetMapping("/getApplicationPersonName/{id}")
    public String getApplicationPersonName(@PathVariable Long id) {
        return personInfoService.getApplicationPersonName(id);
    }

    @GetMapping("/person/{id}")
    public PersonInfo getPerson(@PathVariable Long id) {
        return personInfoService.getOne(id);
    }

    @PostMapping()
    public Long create(@RequestBody Person person, @AuthenticationPrincipal User user) {
        person.setSaved("Сохранено");
        return personService.save(person, user);
        //return personService.getOne(person.getId()).getId();
    }


    @PutMapping("/person/{id}")
    public void update(
            @PathVariable("id") Long personInfoFromDBid,
            @RequestBody Person person,
            @AuthenticationPrincipal User user) {


        Person personFromDB = personInfoService.getPersonByPersonInfo(personInfoFromDBid);
        BeanUtils.copyProperties(person, personFromDB, "id", "person_info");
        System.out.println("update person");
        personService.save(personFromDB, user);
    }

    @GetMapping("/application/{id}")
    public Application getAllApplicationByPersonInfoId(@PathVariable Long id) {
        return personInfoService.getApplicationsByPersonInfo(id);
    }


    @GetMapping("/conditionsDto")
    public List<Wizard> getAll() {
        return wizardService.getAll();
    }

    @GetMapping(value = "/checkUnique")
    public String checkUnique(@PathParam("lastName") String lastName,
                              @PathParam("firstName") String firstName,
                              @PathParam("middleName") String middleName,
                              @PathParam("identityCardCode") String identityCardCode,
                              @PathParam("identityCardSeries") String identityCardSeries,
                              @PathParam("identityCardNumber") String identityCardNumber){
        return personService.checkUnique(lastName,firstName,middleName,identityCardCode,identityCardSeries,identityCardNumber);
    }
}
