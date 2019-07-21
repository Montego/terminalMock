package com.terminalmock.test.repositories.dictionaryrepo;

import com.terminalmock.test.entities.dictionary.TargOrg;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TargOrgRepo extends JpaRepository<TargOrg, String> {
}
