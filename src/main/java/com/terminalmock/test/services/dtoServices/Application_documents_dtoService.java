package com.terminalmock.test.services.dtoServices;

import com.terminalmock.test.entities.dto.Application_documents_dto;
import com.terminalmock.test.repositories.dtorepo.Application_documents_dtoRepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Application_documents_dtoService {
    private final Application_documents_dtoRepo application_documents_dtoRepo;

    public Application_documents_dtoService(Application_documents_dtoRepo application_documents_dtoRepo) {
        this.application_documents_dtoRepo = application_documents_dtoRepo;
    }

    public Application_documents_dto getOne(long id) {
        return application_documents_dtoRepo.findById(id).orElse(null);
    }

    public List<Application_documents_dto> getAll() {
        return application_documents_dtoRepo.findAll();
    }

    public void save(Application_documents_dto application_documents_dto){
        application_documents_dtoRepo.save(application_documents_dto);
    }

    public void delete(Long id) {
        application_documents_dtoRepo.deleteById(id);
    }
}

