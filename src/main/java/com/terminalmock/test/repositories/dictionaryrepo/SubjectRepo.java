package com.terminalmock.test.repositories.dictionaryrepo;

import com.terminalmock.test.entities.dictionary.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SubjectRepo extends JpaRepository<Subject, String> {
    Optional<Subject> findByName(String name);
}
