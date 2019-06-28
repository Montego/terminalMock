package com.terminalmock.test.repositories.dtorepo;

import com.terminalmock.test.entities.dto.Application_documents_dto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Application_documents_dtoRepo extends JpaRepository<Application_documents_dto, Long> {
}
