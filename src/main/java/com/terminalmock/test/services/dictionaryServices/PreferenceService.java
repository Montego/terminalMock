package com.terminalmock.test.services.dictionaryServices;


import com.terminalmock.test.entities.dictionary.Preference;
import com.terminalmock.test.entities.dictionary.Subject;
import com.terminalmock.test.entities.enums.EducationLevel;
import com.terminalmock.test.repositories.dictionaryrepo.PreferenceRepo;
import com.terminalmock.test.repositories.enumsrepo.EducationLevelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class PreferenceService {
    private final PreferenceRepo preferenceRepo;
    private final EducationLevelRepo educationLevelRepo;
    @Autowired
    public PreferenceService(PreferenceRepo preferenceRepo, EducationLevelRepo educationLevelRepo) {
        this.preferenceRepo = preferenceRepo;
        this.educationLevelRepo = educationLevelRepo;
    }

    public Preference getOne(String id) {
        return preferenceRepo.findById(id).orElse(null);
    }

    public List<Preference> getAll() {
        return preferenceRepo.findAll();
    }

    public List<Preference> getAllByEduLevel(int educationLevel){
        EducationLevel findedEducationLevel1 = educationLevelRepo.findById(educationLevel).get();
        int id = findedEducationLevel1.getId();

        List<Preference> preferencesByEducationLevel = preferenceRepo.findAllByEducationLevel(id);
        List<Preference> preferencesAfter2015 = new ArrayList<>();
        for(Preference result : preferencesByEducationLevel){
            if(!result.getOlympYear().equals("2015")){
                preferencesAfter2015.add(result);
            }
        }

//        return preferenceRepo.findAllByEducationLevel(id);
        return preferencesAfter2015;
    }

    public List<Preference> getAllByPrefType(){
        return preferenceRepo.findAllByPrefType(1);
    }

    public List<Preference> getAllByOlymp(Collection<Subject> subjects){
        return preferenceRepo.findAllBySubjects(subjects);
    }
}
