package com.terminalmock.test.repositories.entityrepo;

import com.terminalmock.test.entities.entity.Person_parent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonParentRepo extends JpaRepository<Person_parent, Long> {
}
