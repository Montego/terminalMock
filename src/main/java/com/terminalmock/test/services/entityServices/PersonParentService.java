package com.terminalmock.test.services.entityServices;

import com.terminalmock.test.entities.entity.PersonParent;
import com.terminalmock.test.repositories.entityrepo.PersonParentRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonParentService {
    private final PersonParentRepo person_parentRepo;

    public PersonParentService(PersonParentRepo person_parentRepo) {
        this.person_parentRepo = person_parentRepo;
    }

    public PersonParent getOne(long id) {
        return person_parentRepo.findById(id).orElse(null);
    }

    public List<PersonParent> getAll() {
        return person_parentRepo.findAll();
    }

    public void save(PersonParent person_parent_){
        person_parentRepo.save(person_parent_);
    }

    public void delete(Long id) {
        person_parentRepo.deleteById(id);
    }
}
