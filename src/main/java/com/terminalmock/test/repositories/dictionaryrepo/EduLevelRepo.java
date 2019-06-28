package com.terminalmock.test.repositories.dictionaryrepo;

import com.terminalmock.test.entities.dictionary.EduLevel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EduLevelRepo extends JpaRepository<EduLevel, String> {
}
