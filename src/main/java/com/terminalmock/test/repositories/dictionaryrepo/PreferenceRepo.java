package com.terminalmock.test.repositories.dictionaryrepo;

import com.terminalmock.test.entities.dictionary.Preference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreferenceRepo extends JpaRepository<Preference, String> {
}
