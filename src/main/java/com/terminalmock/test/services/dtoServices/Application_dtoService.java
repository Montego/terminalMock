package com.terminalmock.test.services.dtoServices;

import com.terminalmock.test.entities.dto.Application_dto;
import com.terminalmock.test.repositories.dtorepo.Application_dtoRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Application_dtoService {
    private final Application_dtoRepo application_dtoRepo;

    public Application_dtoService(Application_dtoRepo application_dto) {
        this.application_dtoRepo = application_dto;
    }

    public Application_dto getOne(long id) {
        return application_dtoRepo.findById(id).orElse(null);
    }

    public List<Application_dto> getAll() {
        return application_dtoRepo.findAll();
    }

    public void save(Application_dto application_dto){
        application_dtoRepo.save(application_dto);
    }

    public void delete(Long id) {
        application_dtoRepo.deleteById(id);
    }
}
