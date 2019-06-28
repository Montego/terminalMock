package com.terminalmock.test.repositories.dtorepo;

import com.terminalmock.test.entities.dto.Person_parent_dto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Person_parent_dtoRepo extends JpaRepository<Person_parent_dto, Long> {
}
