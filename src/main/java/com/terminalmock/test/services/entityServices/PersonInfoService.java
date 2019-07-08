package com.terminalmock.test.services.entityServices;

import com.terminalmock.test.entities.entity.PersonInfo;
import com.terminalmock.test.repositories.entityrepo.PersonInfoRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonInfoService {
    private final PersonInfoRepo personInfoRepo;


    public PersonInfoService(PersonInfoRepo personInfoRepo) {
        this.personInfoRepo = personInfoRepo;

    }

    public PersonInfo getOne(long id) {
        return personInfoRepo.findById(id).orElse(null);
    }

    public List<PersonInfo> getAll() {
        return personInfoRepo.findAll();
    }
}
