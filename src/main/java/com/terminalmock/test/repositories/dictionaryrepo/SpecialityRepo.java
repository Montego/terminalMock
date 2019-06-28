package com.terminalmock.test.repositories.dictionaryrepo;

import com.terminalmock.test.entities.dictionary.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialityRepo extends JpaRepository<Speciality, String> {
}
