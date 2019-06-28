package com.terminalmock.test.services.dtoServices;

import com.terminalmock.test.entities.dto.Person_parent_dto;
import com.terminalmock.test.repositories.dtorepo.Person_parent_dtoRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Person_parent_dtoService {
    private final Person_parent_dtoRepo person_parent_dtoRepo;

    public Person_parent_dtoService(Person_parent_dtoRepo person_parent_dtoRepo) {
        this.person_parent_dtoRepo = person_parent_dtoRepo;
    }

    public Person_parent_dto getOne(long id) {
        return person_parent_dtoRepo.findById(id).orElse(null);
    }

    public List<Person_parent_dto> getAll() {
        return person_parent_dtoRepo.findAll();
    }

    public void save(Person_parent_dto person_parent_dto){
        person_parent_dtoRepo.save(person_parent_dto);
    }

    public void delete(Long id) {
        person_parent_dtoRepo.deleteById(id);
    }
}
