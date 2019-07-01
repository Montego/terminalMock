package com.terminalmock.test.services.dtoServices;

import com.terminalmock.test.entities.dto.Person_ege;
import com.terminalmock.test.repositories.dtorepo.PersonEgeRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonEgeService {
    private final PersonEgeRepo person_ege_Repo;

    public PersonEgeService(PersonEgeRepo person_ege_Repo) {
        this.person_ege_Repo = person_ege_Repo;
    }

    public Person_ege getOne(long id) {
        return person_ege_Repo.findById(id).orElse(null);
    }

    public List<Person_ege> getAll() {
        return person_ege_Repo.findAll();
    }

    public void save(Person_ege person_ege_){
        person_ege_Repo.save(person_ege_);
    }

    public void delete(Long id) {
        person_ege_Repo.deleteById(id);
    }
}
