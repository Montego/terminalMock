package com.terminalmock.test.services.dictionaryServices;


import com.terminalmock.test.entities.dictionary.HighSchool;
import com.terminalmock.test.repositories.dictionaryrepo.HighSchoolRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HighSchoolService {
    private final HighSchoolRepo highSchoolRepo;
    @Autowired
    public HighSchoolService(HighSchoolRepo highSchoolRepo) {
        this.highSchoolRepo = highSchoolRepo;
    }

    public HighSchool getOne(String id) {
        return highSchoolRepo.findById(id).orElse(null);
    }

    public List<HighSchool> getAll() {
        return highSchoolRepo.findAll();
    }
}
