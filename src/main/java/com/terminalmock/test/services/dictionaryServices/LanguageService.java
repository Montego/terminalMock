package com.terminalmock.test.services.dictionaryServices;

import com.terminalmock.test.entities.dictionary.Language;
import com.terminalmock.test.repositories.dictionaryrepo.LanguageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageService {
    private final LanguageRepo languageRepo;
    @Autowired
    public LanguageService(LanguageRepo languageRepo) {
        this.languageRepo = languageRepo;
    }

    public Language getOne(String id) {
        return languageRepo.findById(id).orElse(null);
    }

    public List<Language> getAll() {
        return languageRepo.findAll();
    }
}
