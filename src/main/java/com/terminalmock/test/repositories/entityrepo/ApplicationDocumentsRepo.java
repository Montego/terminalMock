package com.terminalmock.test.repositories.entityrepo;

import com.terminalmock.test.entities.entity.ApplicationDocuments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationDocumentsRepo extends JpaRepository<ApplicationDocuments, Long> {
}
