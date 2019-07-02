package com.terminalmock.test.repositories.entityrepo;

import com.terminalmock.test.entities.entity.ApplicationCondition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationConditionRepo extends JpaRepository<ApplicationCondition, Long> {
}
