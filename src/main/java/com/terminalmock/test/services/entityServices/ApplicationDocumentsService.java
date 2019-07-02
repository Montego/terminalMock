package com.terminalmock.test.services.entityServices;

import com.terminalmock.test.entities.entity.ApplicationDocuments;
import com.terminalmock.test.repositories.entityrepo.ApplicationDocumentsRepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ApplicationDocumentsService {
    private final ApplicationDocumentsRepo application_documents_Repo;

    public ApplicationDocumentsService(ApplicationDocumentsRepo application_documents_Repo) {
        this.application_documents_Repo = application_documents_Repo;
    }

    public ApplicationDocuments getOne(long id) {
        return application_documents_Repo.findById(id).orElse(null);
    }

    public List<ApplicationDocuments> getAll() {
        return application_documents_Repo.findAll();
    }

    public void save(ApplicationDocuments application_documents_){
        application_documents_Repo.save(application_documents_);
    }

    public void delete(Long id) {
        application_documents_Repo.deleteById(id);
    }
}

