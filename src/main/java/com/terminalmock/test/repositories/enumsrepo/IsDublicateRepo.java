package com.terminalmock.test.repositories.enumsrepo;

import com.terminalmock.test.entities.enums.IsDublicate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IsDublicateRepo extends JpaRepository<IsDublicate, Long> {
}
