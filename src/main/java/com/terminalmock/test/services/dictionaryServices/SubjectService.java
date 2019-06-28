package com.terminalmock.test.services.dictionaryServices;


import com.terminalmock.test.entities.dictionary.Subject;
import com.terminalmock.test.repositories.dictionaryrepo.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {
    private final SubjectRepo subjectRepo;
    @Autowired
    public SubjectService(SubjectRepo subjectRepo) {
        this.subjectRepo = subjectRepo;
    }

    public Subject getOne(String id) {
        return subjectRepo.findById(id).orElse(null);
    }

    public List<Subject> getAll() {
        return subjectRepo.findAll();
    }
}
