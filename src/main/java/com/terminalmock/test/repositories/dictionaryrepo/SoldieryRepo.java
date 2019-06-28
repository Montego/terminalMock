package com.terminalmock.test.repositories.dictionaryrepo;

import com.terminalmock.test.entities.dictionary.Soldiery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SoldieryRepo extends JpaRepository<Soldiery, String> {
}
