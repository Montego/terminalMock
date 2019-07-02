package com.terminalmock.test.services.entityServices;

import com.terminalmock.test.entities.entity.Application;
import com.terminalmock.test.repositories.entityrepo.ApplicationRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService {
    private final ApplicationRepo application_Repo;

    public ApplicationService(ApplicationRepo application_dto) {
        this.application_Repo = application_dto;
    }

    public Application getOne(long id) {
        return application_Repo.findById(id).orElse(null);
    }

    public List<Application> getAll() {
        return application_Repo.findAll();
    }

    public void save(Application application_){
        application_Repo.save(application_);
    }

    public void delete(Long id) {
        application_Repo.deleteById(id);
    }
}
