package com.terminalmock.test.controllers;

import com.terminalmock.test.dto.AxDto;
import com.terminalmock.test.repositories.dtorepo.AxDtoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ax")
public class AxController {

    @Autowired
    AxDtoRepository axDtoRepository;

    @PostMapping
    public void saveDto(@RequestBody AxDto dto){
        axDtoRepository.save(dto);
    }

    @GetMapping("/{id}")
    public AxDto findByProfile(@PathVariable("id") Long id){
        return axDtoRepository.findByProfileId(id).orElse(null);
    }
}
