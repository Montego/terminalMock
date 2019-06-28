package com.terminalmock.test.repositories.enumsrepo;

import com.terminalmock.test.entities.enums.LangInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LangInfoRepo extends JpaRepository<LangInfo, Long> {
}
