package com.terminalmock.test.repositories.dictionaryrepo;

import com.terminalmock.test.entities.dictionary.AddressState;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressStateRepo extends JpaRepository<AddressState, String> {
}
