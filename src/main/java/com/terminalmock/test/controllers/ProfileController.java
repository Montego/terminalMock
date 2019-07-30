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

//    @PostMapping("/search/")
//    public Iterable<PersonInfo> searching (@RequestBody SearchParams params, HttpServletRequest request){
//            return searchPersonInfoSvc.searchMedCerts(params, request);
//    }
        @PostMapping("/search/")
        public List<PersonTableDto> searching (@RequestBody SearchParams params, HttpServletRequest request){
            return searchPersonInfoSvc.searchMedCerts(params, request);
        }

    @GetMapping("/persons")
    public List<Person> getListPerson() {
        System.out.println("return all profiles");
        return personService.getAll();
    }
    @GetMapping("/personsTable")
    public List<PersonTableDto> getAllPersonTableDto(@AuthenticationPrincipal User user) {
        return personService.getAllPersonTableDto(user);
    }
//    @GetMapping("/applicationsTable")
//    public List<ApplicationTableDto> getAllApplicationTableDto() {
//        return personService.getAllApplicationTableDto();
//    }

//    @GetMapping("/person/{id}")
//    public Person getPerson(@PathVariable Long id) {
//        return personService.getOne(id);
//    }

    @GetMapping("/personByPersonInfo/{id}")
    public Person getPersonByPersonInfo(@PathVariable Long id){
        return personInfoService.getPersonByPersonInfo(id);
    }

    @GetMapping("/getApplicationsByPersonInfo/{id}")
    public Application getApplicationsByPersonInfo(@PathVariable Long id){
        return personInfoService.getApplicationsByPersonInfo(id);
    }

    @GetMapping("/getApplicationPersonName/{id}")
    public String getApplicationPersonName(@PathVariable Long id){
        return personInfoService.getApplicationPersonName(id);
    }

    @GetMapping("/person/{id}")
    public PersonInfo getPerson(@PathVariable Long id) {
        return personInfoService.getOne(id);
    }

    @PostMapping()
    public Long create(@RequestBody Person person, @AuthenticationPrincipal User user) {
        System.out.println(person.getPerson_info());
        System.out.println("save person");
        person.setSaved("Сохранено");
        personService.save(person,user);
        return personService.getOne(person.getId()).getId();
    }

//    @PutMapping("/person/{id}")
//    public void update(
//            @PathVariable("id") Person personFromDB,
//            @RequestBody Person person) {
//        BeanUtils.copyProperties(person, personFromDB, "id");
//        System.out.println("update person");
//        personService.save(personFromDB);
//    }

    @PutMapping("/person/{id}")
    public void update(
            @PathVariable("id") Long personInfoFromDBid,
            @RequestBody Person person,
            @AuthenticationPrincipal User user) {

//        PersonInfo personInfoFromDB = personInfoService.getOne(personInfoFromDBid);
//        PersonInfo personInfo = person.getPersonInfo();

        Person personFromDB = personInfoService.getPersonByPersonInfo(personInfoFromDBid);
        BeanUtils.copyProperties(person, personFromDB, "id","person_info");
        System.out.println("update person");
        personService.save(personFromDB,user);
    }
//    @PutMapping("/acceptPerson/{id}")
//    public String acceptPerson(
//            @PathVariable("id") Long personInfoFromDBid,
//            @RequestBody String accept,
//            @AuthenticationPrincipal User user){
//        Person personFromDB = personInfoService.getPersonByPersonInfo(personInfoFromDBid);
//        Person personFromDBNew = personInfoService.getPersonByPersonInfo(personInfoFromDBid);
//        personFromDBNew.setAcceptedPerson(accept);
//        BeanUtils.copyProperties(personFromDBNew, personFromDB, "id");
//        personService.save(personFromDBNew, user);
//        return "Утверждено";
//    }


//    @PutMapping("/saved/{id}")
//    public List<PersonTableDto> savedPerson(
//            @PathVariable("id") Long personInfoFromDBid,
//            @RequestBody String saved,
//            @AuthenticationPrincipal User user){
//        Person personFromDB = personInfoService.getPersonByPersonInfo(personInfoFromDBid);
//        Person personFromDBNew = personInfoService.getPersonByPersonInfo(personInfoFromDBid);
//        personFromDBNew.setSaved(saved);
//        BeanUtils.copyProperties(personFromDBNew, personFromDB, "id");
//        personService.save(personFromDBNew,user);
//        return personService.getAllPersonTableDto(user);
//    }

//    @GetMapping("/conditionsDto")
//    public List<ConditionsDto> getAll(){
//        return conditionsDtoService.getAll();
//    }
    @GetMapping("/application/{id}")
    public Application getAllApplicationByPersonInfoId(@PathVariable Long id){
        return personInfoService.getApplicationsByPersonInfo(id);
    }


    @GetMapping("/conditionsDto")
    public List<Wizard> getAll(){
        return wizardService.getAll();
    }
//    @GetMapping("/testSave")
//    public void doShit(){
//        Person person = new Person();
//        person.setId(1000);
//        person.setTab_personal_employDays(4);
//        person.setTab_personal_employMonths(1);
//        person.setTab_personal_employYears(4);
//        person.setTab_personal_isCompatriot(false);
//        person.setTab_personal_isEquatedForeign(false);
//        person.setTab_personal_isHostel(false);
//        person.setTab_personal_isForeignLikeRussian(true);
//        Set<ApplicationCondition> conditions = new LinkedHashSet<>();
//        ApplicationCondition ap = new ApplicationCondition();
//        ap.setId(1001);
//        ap.setPerson(person);
//        ap.setSelected_agreement("TECT");
//        conditions.add(ap);
//
//
//        person.setApplication_condition(conditions);
//        personService.save(person);
//    }


}
