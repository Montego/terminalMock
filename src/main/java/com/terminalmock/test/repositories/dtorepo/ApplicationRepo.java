package com.terminalmock.test.repositories.dtorepo;

import com.terminalmock.test.entities.dto.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepo extends JpaRepository<Application, Long> {
}
