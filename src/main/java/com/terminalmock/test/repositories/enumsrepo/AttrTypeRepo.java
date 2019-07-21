package com.terminalmock.test.repositories.enumsrepo;

import com.terminalmock.test.entities.enums.AttrType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttrTypeRepo extends JpaRepository<AttrType, Integer> {
}
