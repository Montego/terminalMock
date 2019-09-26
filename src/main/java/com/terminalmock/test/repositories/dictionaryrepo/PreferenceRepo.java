package com.terminalmock.test.repositories.dictionaryrepo;

import com.terminalmock.test.entities.dictionary.Preference;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PreferenceRepo extends JpaRepository<Preference, String> {
    List<Preference> findAllByEducationLevel(int id);
    List<Preference> findAllByPrefType(int id);

}
