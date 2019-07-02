package com.terminalmock.test.repositories.enumsrepo;

import com.terminalmock.test.entities.enums.PrefType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrefTypeRepo extends JpaRepository<PrefType, Long> {
}
