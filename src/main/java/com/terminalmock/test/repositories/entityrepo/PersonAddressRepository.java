package com.terminalmock.test.repositories.entityrepo;

import com.terminalmock.test.entities.entity.address.PersonAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonAddressRepository extends JpaRepository<PersonAddress, Integer> {
}
