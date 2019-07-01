package com.terminalmock.test.controllers;

import com.terminalmock.test.entities.dto.Application_condition;
import com.terminalmock.test.entities.dto.Person;
import com.terminalmock.test.services.dtoServices.PersonService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("api/profile")
public class ProfileController {
    private final PersonService personService;

    @Autowired
    public ProfileController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/persons")
    public List<Person> getListPerson() {
        return personService.getAll();
    }
    @GetMapping("/person/{id}")
    public Person getPerson(@PathVariable Long id) {
        return personService.getOne(id);
    }

    @PostMapping()
    public Person create(@RequestBody Person person) {
        System.out.println("save person");
        personService.save(person);
        return person;
    }

    @PutMapping("/person/{id}")
    public void update(
            @PathVariable("id") Person personFromDB,
            @RequestBody Person person) {
        BeanUtils.copyProperties(person, personFromDB, "id");
        System.out.println("update person");
        personService.save(personFromDB);
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
//        Set<Application_condition> conditions = new LinkedHashSet<>();
//        Application_condition ap = new Application_condition();
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
