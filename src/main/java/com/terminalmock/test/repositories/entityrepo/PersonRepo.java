package com.terminalmock.test.repositories.entityrepo;

import com.terminalmock.test.entities.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person, Long> {
}
