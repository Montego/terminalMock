package com.terminalmock.test.services.dictionaryServices;


import com.terminalmock.test.entities.dictionary.AcademyYear;
import com.terminalmock.test.repositories.dictionaryrepo.AcademyYearRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcademyYearService {
    private final AcademyYearRepo academyYearRepo;
    @Autowired
    public AcademyYearService(AcademyYearRepo academyYearRepo) {
        this.academyYearRepo = academyYearRepo;
    }


    public AcademyYear getOne(String id) {
        return academyYearRepo.findById(id).orElse(null);
    }

    public Iterable<AcademyYear> getAll() {
        return academyYearRepo.findAll(Sort.by("AcademyYearId").descending());
    }
}
