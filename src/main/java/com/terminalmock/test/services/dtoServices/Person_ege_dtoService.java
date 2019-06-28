package com.terminalmock.test.services.dtoServices;

import com.terminalmock.test.entities.dto.Person_ege_dto;
import com.terminalmock.test.repositories.dtorepo.Person_ege_dtoRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Person_ege_dtoService {
    private final Person_ege_dtoRepo person_ege_dtoRepo;

    public Person_ege_dtoService(Person_ege_dtoRepo person_ege_dtoRepo) {
        this.person_ege_dtoRepo = person_ege_dtoRepo;
    }

    public Person_ege_dto getOne(long id) {
        return person_ege_dtoRepo.findById(id).orElse(null);
    }

    public List<Person_ege_dto> getAll() {
        return person_ege_dtoRepo.findAll();
    }

    public void save(Person_ege_dto person_ege_dto){
        person_ege_dtoRepo.save(person_ege_dto);
    }

    public void delete(Long id) {
        person_ege_dtoRepo.deleteById(id);
    }
}
