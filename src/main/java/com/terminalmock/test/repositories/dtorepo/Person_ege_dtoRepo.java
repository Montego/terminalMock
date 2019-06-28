package com.terminalmock.test.repositories.dtorepo;

import com.terminalmock.test.entities.dto.Person_ege_dto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Person_ege_dtoRepo extends JpaRepository<Person_ege_dto, Long> {
}
