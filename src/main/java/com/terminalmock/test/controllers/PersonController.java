package com.terminalmock.test.controllers;

import com.terminalmock.test.entities.entity.address.AddressCellBasedDto;
import com.terminalmock.test.services.entityServices.PersonInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/util")
public class PersonController {
    @Autowired
    PersonInfoService personInfoService;

    @GetMapping("/addresses")
    public List<AddressCellBasedDto> getAddressesDto(){
        return personInfoService.getAddressesDto();

    }

    @GetMapping("/parrentAddress")
    public AddressCellBasedDto getParrentAddress(){
        return personInfoService.getParentAddressDto();
    }

//    @Autowired
//    PersonRepo personRepo;
//
//    @GetMapping("/getEmptyPerson")
//    public Person getEmptyMedCertDPO(){
//        return new Person(true);
//    }
//
//    @PostMapping("/person")
//    public Person save(@RequestBody Person person){
//        return personRepo.save(person);
//    }

}
