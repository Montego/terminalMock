package com.terminalmock.test.repositories.dictionaryrepo;


import com.terminalmock.test.entities.dictionary.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageRepo extends JpaRepository<Language, String> {
}
