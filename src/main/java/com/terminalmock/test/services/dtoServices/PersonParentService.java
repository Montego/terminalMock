package com.terminalmock.test.services.dtoServices;

import com.terminalmock.test.entities.dto.Person_parent;
import com.terminalmock.test.repositories.dtorepo.PersonParentRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonParentService {
    private final PersonParentRepo person_parentRepo;

    public PersonParentService(PersonParentRepo person_parentRepo) {
        this.person_parentRepo = person_parentRepo;
    }

    public Person_parent getOne(long id) {
        return person_parentRepo.findById(id).orElse(null);
    }

    public List<Person_parent> getAll() {
        return person_parentRepo.findAll();
    }

    public void save(Person_parent person_parent_){
        person_parentRepo.save(person_parent_);
    }

    public void delete(Long id) {
        person_parentRepo.deleteById(id);
    }
}
