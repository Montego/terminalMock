package com.terminalmock.test.repositories.entityrepo;

import com.terminalmock.test.entities.entity.address.PersonParentAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonParentAddressRepository extends JpaRepository<PersonParentAddress, Integer> {
}
