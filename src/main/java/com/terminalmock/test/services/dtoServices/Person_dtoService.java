package com.terminalmock.test.services.dtoServices;

import com.terminalmock.test.entities.dto.Person_dto;
import com.terminalmock.test.repositories.dtorepo.Person_dtoRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Person_dtoService {
    private final Person_dtoRepo person_dtoRepo;

    public Person_dtoService(Person_dtoRepo person_dtoRepo) {
        this.person_dtoRepo = person_dtoRepo;
    }

    public Person_dto getOne(long id) {
        return person_dtoRepo.findById(id).orElse(null);
    }

    public List<Person_dto> getAll() {
        return person_dtoRepo.findAll();
    }

    public void save(Person_dto person_dto){
        person_dtoRepo.save(person_dto);
    }

    public void delete(Long id) {
        person_dtoRepo.deleteById(id);
    }
}
