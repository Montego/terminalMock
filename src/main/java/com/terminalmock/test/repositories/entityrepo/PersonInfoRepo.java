package com.terminalmock.test.repositories.entityrepo;

import com.terminalmock.test.entities.entity.PersonInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface PersonInfoRepo extends JpaSpecificationExecutor<PersonInfo>,JpaRepository<PersonInfo, Long>, PagingAndSortingRepository<PersonInfo,Long> {

    List<PersonInfo> findAllByModifiedBy(String modifiedBy);
}
