package com.terminalmock.test.services.enumsServices;


import com.terminalmock.test.entities.enums.EducationLevel;
import com.terminalmock.test.repositories.enumsrepo.EducationLevelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationLevelService {
    private final EducationLevelRepo educationLevelRepo;
    @Autowired
    public EducationLevelService(EducationLevelRepo educationLevelRepo) {
        this.educationLevelRepo = educationLevelRepo;
    }

    public EducationLevel getOne(int id) {
        return educationLevelRepo.findById(id).orElse(null);
    }

    public List<EducationLevel> getAll() {
        return educationLevelRepo.findAll();
    }
}
