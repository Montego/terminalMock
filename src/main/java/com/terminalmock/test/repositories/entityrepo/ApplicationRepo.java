package com.terminalmock.test.repositories.entityrepo;

import com.terminalmock.test.entities.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepo extends JpaRepository<Application, Long> {
}
