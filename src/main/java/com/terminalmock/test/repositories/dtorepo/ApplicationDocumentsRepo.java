package com.terminalmock.test.repositories.dtorepo;

import com.terminalmock.test.entities.dto.Application_documents;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationDocumentsRepo extends JpaRepository<Application_documents, Long> {
}
