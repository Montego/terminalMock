package com.terminalmock.test.services.enumsServices;


import com.terminalmock.test.entities.enums.Gender;
import com.terminalmock.test.repositories.enumsrepo.GenderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenderService {

    private final GenderRepo genderRepo;
    @Autowired
    public GenderService(GenderRepo genderRepo) {
        this.genderRepo = genderRepo;
    }

    public Gender getOne(Integer id) {
        return genderRepo.findById(id).orElse(null);
    }

    public List<Gender> getAll() {
        return genderRepo.findAll();
    }
}
