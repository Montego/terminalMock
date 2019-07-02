package com.terminalmock.test.controllers;

import com.terminalmock.test.dto.ResponseEgeInfo;
import com.terminalmock.test.entities.entity.Person;
import com.terminalmock.test.services.entityServices.PersonEgeService;
import com.terminalmock.test.services.entityServices.PersonService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/profile")
public class ProfileController {
    private final PersonService personService;
    private final PersonEgeService personEgeService;
    @Autowired
    public ProfileController(PersonService personService, PersonEgeService personEgeService) {
        this.personService = personService;

        this.personEgeService = personEgeService;
    }

    @GetMapping("/persons")
    public List<Person> getListPerson() {
        System.out.println("return all profiles");
        return personService.getAll();
    }
//    @GetMapping("/person_ege/{id}")
//    public List<ResponseEgeInfo> findAllById(@PathVariable Long id) {
//        System.out.println("return all ege");
//        return personEgeService.findAllByPerson_ege_id(id);
//    }
    @GetMapping("/person/{id}")
    public Person getPerson(@PathVariable Long id) {
        return personService.getOne(id);
    }

    @PostMapping()
    public Person create(@RequestBody Person person) {
        System.out.println(person.getApplication_condition());
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