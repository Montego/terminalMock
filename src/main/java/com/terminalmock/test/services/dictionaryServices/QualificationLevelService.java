package com.terminalmock.test.services.dictionaryServices;


import com.terminalmock.test.entities.dictionary.QualificationLevel;
import com.terminalmock.test.repositories.dictionaryrepo.QualificationLevelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QualificationLevelService {
    private final QualificationLevelRepo qualificationLevelRepo;
    @Autowired
    public QualificationLevelService(QualificationLevelRepo qualificationLevelRepo) {
        this.qualificationLevelRepo = qualificationLevelRepo;
    }

    public QualificationLevel getOne(String id) {
        return qualificationLevelRepo.findById(id).orElse(null);
    }

    public List<QualificationLevel> getAll() {
        return qualificationLevelRepo.findAll();
    }
}
