package com.terminalmock.test.repositories.dtorepo;

import com.terminalmock.test.entities.dto.Application_dto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Application_dtoRepo extends JpaRepository<Application_dto, Long> {
}
