package com.terminalmock.test.repositories.entityrepo;

import com.terminalmock.test.entities.entity.Application;
import com.terminalmock.test.entities.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.Optional;

public interface ApplicationRepo extends JpaRepository<Application, Long> {

    ArrayList<Application> findAllByPerson(Person person);

}
