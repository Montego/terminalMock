package com.terminalmock.test.repositories.dtorepo;

import com.terminalmock.test.entities.dto.Person_dto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Person_dtoRepo extends JpaRepository<Person_dto, Long> {
}
