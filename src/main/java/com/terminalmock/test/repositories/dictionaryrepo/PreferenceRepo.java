package com.terminalmock.test.repositories.dictionaryrepo;

import com.terminalmock.test.entities.dictionary.Preference;
import com.terminalmock.test.entities.dictionary.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

public interface PreferenceRepo extends JpaRepository<Preference, String> {
    List<Preference> findAllByEducationLevel(int id);
    List<Preference> findAllByPrefType(int id);
    List<Preference> findAllBySubjects(Collection<Subject> subjects);

}
