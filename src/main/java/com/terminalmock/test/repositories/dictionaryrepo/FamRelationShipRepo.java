package com.terminalmock.test.repositories.dictionaryrepo;

import com.terminalmock.test.entities.dictionary.FamRelationShip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FamRelationShipRepo extends JpaRepository<FamRelationShip, String> {
}
