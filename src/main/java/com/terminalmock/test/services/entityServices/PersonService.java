package com.terminalmock.test.services.entityServices;

import com.terminalmock.test.entities.entity.Person;
import com.terminalmock.test.repositories.entityrepo.PersonRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private final PersonRepo person_Repo;

    public PersonService(PersonRepo person_Repo) {
        this.person_Repo = person_Repo;
    }

    public Person getOne(long id) {
        return person_Repo.findById(id).orElse(null);
    }

    public List<Person> getAll() {
        return person_Repo.findAll();
    }

    public void save(Person person){
        person_Repo.save(person);
    }

    public void delete(Long id) {
        person_Repo.deleteById(id);
    }
}
