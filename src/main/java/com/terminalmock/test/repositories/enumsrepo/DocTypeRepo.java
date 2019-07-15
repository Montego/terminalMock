package com.terminalmock.test.repositories.enumsrepo;

import com.terminalmock.test.entities.enums.DocType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocTypeRepo extends JpaRepository<DocType, Integer> {
}
