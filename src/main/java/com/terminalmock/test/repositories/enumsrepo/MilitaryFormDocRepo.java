package com.terminalmock.test.repositories.enumsrepo;

import com.terminalmock.test.entities.enums.MilitaryFormDoc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MilitaryFormDocRepo extends JpaRepository<MilitaryFormDoc, Long> {
}
