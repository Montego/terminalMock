package com.terminalmock.test.repositories.entityrepo;

import com.terminalmock.test.entities.entity.Person;
import com.terminalmock.test.entities.entity.PersonInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonInfoRepo extends JpaRepository<PersonInfo, Long> {
}
