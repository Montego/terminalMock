package com.terminalmock.test.repositories.dtorepo;

import com.terminalmock.test.entities.dto.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person, Long> {
}
