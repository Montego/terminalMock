package com.terminalmock.test.repositories.dictionaryrepo;

import com.terminalmock.test.entities.dictionary.EduDoc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EduDocRepo extends JpaRepository<EduDoc, String> {
}
