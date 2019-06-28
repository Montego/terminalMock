package com.terminalmock.test.repositories.dictionaryrepo;

import com.terminalmock.test.entities.dictionary.QualificationLevel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QualificationLevelRepo extends JpaRepository<QualificationLevel, String> {
}
