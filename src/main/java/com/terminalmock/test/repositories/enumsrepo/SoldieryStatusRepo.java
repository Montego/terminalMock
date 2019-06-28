package com.terminalmock.test.repositories.enumsrepo;

import com.terminalmock.test.entities.enums.SoldieryStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SoldieryStatusRepo extends JpaRepository<SoldieryStatus, Long> {
}
