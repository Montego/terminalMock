package com.terminalmock.test.controllers;

import com.terminalmock.test.entities.entity.Person;
import com.terminalmock.test.repositories.entityrepo.PersonRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class PersonController {

    PersonRepo personRepo;

    @GetMapping("/getEmptyPerson")
    public Person getEmptyMedCertDPO(){

        return new Person(true);
    }

}
