package com.terminalmock.test.repositories.dictionaryrepo;

import com.terminalmock.test.entities.dictionary.IdentityCardCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdentityCardCodeRepo extends JpaRepository<IdentityCardCode, String> {
}
