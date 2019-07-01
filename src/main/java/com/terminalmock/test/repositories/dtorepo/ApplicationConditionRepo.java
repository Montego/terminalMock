package com.terminalmock.test.repositories.dtorepo;

import com.terminalmock.test.entities.dto.Application_condition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationConditionRepo extends JpaRepository<Application_condition, Long> {
}
