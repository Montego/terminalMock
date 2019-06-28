package com.terminalmock.test.repositories.dictionaryrepo;

import com.terminalmock.test.entities.dictionary.HighSchool;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HighSchoolRepo extends JpaRepository<HighSchool, String> {
}
