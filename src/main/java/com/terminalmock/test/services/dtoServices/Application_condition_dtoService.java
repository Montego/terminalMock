package com.terminalmock.test.services.dtoServices;

import com.terminalmock.test.entities.dto.Application_condition_dto;
import com.terminalmock.test.repositories.dtorepo.Application_condition_dtoRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Application_condition_dtoService {
    private final Application_condition_dtoRepo application_condition_dtoRepo;

    public Application_condition_dtoService(Application_condition_dtoRepo application_condition_dtoRepo) {
        this.application_condition_dtoRepo = application_condition_dtoRepo;
    }

    public Application_condition_dto getOne(long id) {
        return application_condition_dtoRepo.findById(id).orElse(null);
    }

    public List<Application_condition_dto> getAll() {
        return application_condition_dtoRepo.findAll();
    }

    public void save(Application_condition_dto application){
        application_condition_dtoRepo.save(application);
    }

    public void delete(Long id) {
        application_condition_dtoRepo.deleteById(id);
    }
}
