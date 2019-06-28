package com.terminalmock.test.repositories.enumsrepo;


import com.terminalmock.test.entities.enums.AccreditationDocType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccreditationDocTypeRepo extends JpaRepository<AccreditationDocType, Long> {
}
