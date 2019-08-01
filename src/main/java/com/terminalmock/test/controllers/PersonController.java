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
    public List<AddressCellBasedDto> getAddressesDto() {
        return personInfoService.getAddressesDto();

    }

    @GetMapping("/parentAddress")
    public AddressCellBasedDto getParrentAddress() {
        return personInfoService.getParentAddressDto();
    }


}
