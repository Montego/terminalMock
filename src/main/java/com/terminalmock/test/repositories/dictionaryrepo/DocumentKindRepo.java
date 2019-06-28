package com.terminalmock.test.repositories.dictionaryrepo;

import com.terminalmock.test.entities.dictionary.DocumentKind;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentKindRepo extends JpaRepository<DocumentKind, String> {
}
