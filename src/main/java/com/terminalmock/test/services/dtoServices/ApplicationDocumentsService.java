package com.terminalmock.test.services.dtoServices;

import com.terminalmock.test.entities.dto.Application_documents;
import com.terminalmock.test.repositories.dtorepo.ApplicationDocumentsRepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ApplicationDocumentsService {
    private final ApplicationDocumentsRepo application_documents_Repo;

    public ApplicationDocumentsService(ApplicationDocumentsRepo application_documents_Repo) {
        this.application_documents_Repo = application_documents_Repo;
    }

    public Application_documents getOne(long id) {
        return application_documents_Repo.findById(id).orElse(null);
    }

    public List<Application_documents> getAll() {
        return application_documents_Repo.findAll();
    }

    public void save(Application_documents application_documents_){
        application_documents_Repo.save(application_documents_);
    }

    public void delete(Long id) {
        application_documents_Repo.deleteById(id);
    }
}

