package com.terminalmock.test.repositories.enumsrepo;

import com.terminalmock.test.entities.enums.EducationLevel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationLevelRepo extends JpaRepository<EducationLevel, Long> {
}
