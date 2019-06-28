package com.terminalmock.test.services.dictionaryServices;


import com.terminalmock.test.entities.dictionary.EduDoc;
import com.terminalmock.test.repositories.dictionaryrepo.EduDocRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EduDocService {
    private final EduDocRepo eduDocRepo;
    @Autowired
    public EduDocService(EduDocRepo eduDocRepo) {
        this.eduDocRepo = eduDocRepo;
    }

    public EduDoc getOne(String id) {
        return eduDocRepo.findById(id).orElse(null);
    }

    public List<EduDoc> getAll() {
        return eduDocRepo.findAll();
    }
}
