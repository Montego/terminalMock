package com.terminalmock.test.controllers;


import com.terminalmock.test.dto.ApplicationTableDto;
import com.terminalmock.test.dto.ConditionsDto;
import com.terminalmock.test.dto.PersonTableDto;
import com.terminalmock.test.entities.entity.Application;
import com.terminalmock.test.entities.entity.Person;
import com.terminalmock.test.entities.entity.PersonInfo;
import com.terminalmock.test.services.dtoServices.ConditionsDtoService;
import com.terminalmock.test.services.entityServices.PersonInfoService;
import com.terminalmock.test.services.entityServices.PersonService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    ConditionsDtoService conditionsDtoService;

    private final PersonService personService;
    private final PersonInfoService personInfoService;
    @Autowired
    public ProfileController(PersonService personService,PersonInfoService personInfoService) {
        this.personService = personService;
        this.personInfoService = personInfoService;
    }

    @GetMapping("/persons")
    public List<Person> getListPerson() {
        System.out.println("return all profiles");
        return personService.getAll();
    }
    @GetMapping("/personsTable")
    public List<PersonTableDto> getAllPersonTableDto() {
        return personService.getAllPersonTableDto();
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
    public Person create(@RequestBody Person person) {
        System.out.println(person.getPerson_info());
        System.out.println("save person");
        personService.save(person);
        return person;
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
            @RequestBody Person person) {

//        PersonInfo personInfoFromDB = personInfoService.getOne(personInfoFromDBid);
//        PersonInfo personInfo = person.getPersonInfo();

        Person personFromDB = personInfoService.getPersonByPersonInfo(personInfoFromDBid);
        BeanUtils.copyProperties(person, personFromDB, "id");
        System.out.println("update person");
        personService.save(personFromDB);
    }
    @PutMapping("/acceptPerson/{id}")
    public String acceptPerson(
            @PathVariable("id") Long personInfoFromDBid,
            @RequestBody String accept){
        Person personFromDB = personInfoService.getPersonByPersonInfo(personInfoFromDBid);
        Person personFromDBNew = personInfoService.getPersonByPersonInfo(personInfoFromDBid);
        personFromDBNew.setAcceptedPerson(accept);
        BeanUtils.copyProperties(personFromDBNew, personFromDB, "id");
        personService.save(personFromDBNew);
        return "Утверждено";
    }


    @PutMapping("/saved/{id}")
    public List<PersonTableDto> savedPerson(
            @PathVariable("id") Long personInfoFromDBid,
            @RequestBody String saved){
        Person personFromDB = personInfoService.getPersonByPersonInfo(personInfoFromDBid);
        Person personFromDBNew = personInfoService.getPersonByPersonInfo(personInfoFromDBid);
        personFromDBNew.setSaved(saved);
        BeanUtils.copyProperties(personFromDBNew, personFromDB, "id");
        personService.save(personFromDBNew);
        return personService.getAllPersonTableDto();
    }

    @GetMapping("/conditionsDto")
    public List<ConditionsDto> getAll(){
        return conditionsDtoService.getAll();
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
