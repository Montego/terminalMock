package com.terminalmock.test.repositories.dictionaryrepo;

import com.terminalmock.test.entities.dictionary.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepo extends JpaRepository<Subject, String> {
}
