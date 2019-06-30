package com.terminalmock.test.repositories.dictionaryrepo;

import com.terminalmock.test.entities.dictionary.FamRelationship;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FamRelationShipRepo extends JpaRepository<FamRelationship, String> {
}
