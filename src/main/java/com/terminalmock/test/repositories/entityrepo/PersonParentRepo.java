package com.terminalmock.test.repositories.entityrepo;

import com.terminalmock.test.entities.entity.PersonParent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonParentRepo extends JpaRepository<PersonParent, Long> {
}
