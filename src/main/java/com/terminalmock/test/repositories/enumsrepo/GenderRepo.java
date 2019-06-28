package com.terminalmock.test.repositories.enumsrepo;

import com.terminalmock.test.entities.enums.Gender;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenderRepo extends JpaRepository<Gender, Integer> {
}
