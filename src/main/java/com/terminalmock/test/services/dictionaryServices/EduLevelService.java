package com.terminalmock.test.services.dictionaryServices;


import com.terminalmock.test.entities.dictionary.EduLevel;
import com.terminalmock.test.repositories.dictionaryrepo.EduLevelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EduLevelService {
    private final EduLevelRepo eduLevelRepo;
    @Autowired
    public EduLevelService(EduLevelRepo eduLevelRepo) {
        this.eduLevelRepo = eduLevelRepo;
    }

    public EduLevel getOne(String id) {
        return eduLevelRepo.findById(id).orElse(null);
    }

    public List<EduLevel> getAll() {
        return eduLevelRepo.findAll();
    }
}
