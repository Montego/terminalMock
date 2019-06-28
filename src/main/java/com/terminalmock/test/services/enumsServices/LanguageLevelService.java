package com.terminalmock.test.services.enumsServices;


import com.terminalmock.test.entities.enums.LanguageLevel;
import com.terminalmock.test.repositories.enumsrepo.LanguageLevelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageLevelService {
    private final LanguageLevelRepo languageLevelRepo;
    @Autowired
    public LanguageLevelService(LanguageLevelRepo languageLevelRepo) {
        this.languageLevelRepo = languageLevelRepo;
    }

    public LanguageLevel getOne(Long id) {
        return languageLevelRepo.findById(id).orElse(null);
    }

    public List<LanguageLevel> getAll() {
        return languageLevelRepo.findAll();
    }
}
