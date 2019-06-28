package com.terminalmock.test.services.dictionaryServices;


import com.terminalmock.test.entities.dictionary.Speciality;
import com.terminalmock.test.repositories.dictionaryrepo.SpecialityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecialityService {
    private final SpecialityRepo specialityRepo;
    @Autowired
    public SpecialityService(SpecialityRepo specialityRepo) {
        this.specialityRepo = specialityRepo;
    }

    public Speciality getOne(String id) {
        return specialityRepo.findById(id).orElse(null);
    }

    public List<Speciality> getAll() {
        return specialityRepo.findAll();
    }
}
