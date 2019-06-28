package com.terminalmock.test.services.dictionaryServices;


import com.terminalmock.test.entities.dictionary.Preference;
import com.terminalmock.test.repositories.dictionaryrepo.PreferenceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreferenceService {
    private final PreferenceRepo preferenceRepo;
    @Autowired
    public PreferenceService(PreferenceRepo preferenceRepo) {
        this.preferenceRepo = preferenceRepo;
    }

    public Preference getOne(String id) {
        return preferenceRepo.findById(id).orElse(null);
    }

    public List<Preference> getAll() {
        return preferenceRepo.findAll();
    }
}
