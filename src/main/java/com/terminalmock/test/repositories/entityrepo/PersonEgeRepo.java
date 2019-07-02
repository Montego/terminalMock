package com.terminalmock.test.repositories.entityrepo;

import com.terminalmock.test.dto.ResponseEgeInfo;
import com.terminalmock.test.entities.entity.Person_ege;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonEgeRepo extends JpaRepository<Person_ege, Long> {
//    List<ResponseEgeInfo> findAllByPerson_ege_id(Long id);
}
