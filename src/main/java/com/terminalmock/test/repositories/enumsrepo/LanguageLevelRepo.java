package com.terminalmock.test.repositories.enumsrepo;

import com.terminalmock.test.entities.enums.LanguageLevel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageLevelRepo extends JpaRepository<LanguageLevel, Long> {
}
