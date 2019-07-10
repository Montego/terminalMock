package com.terminalmock.test.repositories.entityrepo;

import com.terminalmock.test.entities.entity.Person;
import com.terminalmock.test.entities.entity.PersonInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PersonInfoRepo extends JpaSpecificationExecutor<PersonInfo>,JpaRepository<PersonInfo, Long> {
}
