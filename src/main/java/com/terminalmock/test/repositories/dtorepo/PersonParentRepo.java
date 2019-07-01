package com.terminalmock.test.repositories.dtorepo;

import com.terminalmock.test.entities.dto.Person_parent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonParentRepo extends JpaRepository<Person_parent, Long> {
}
