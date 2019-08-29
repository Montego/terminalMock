package com.terminalmock.test.repositories.enumsrepo;

import com.terminalmock.test.entities.enums.EducationLevel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EducationLevelRepo extends JpaRepository<EducationLevel, Integer> {

}
