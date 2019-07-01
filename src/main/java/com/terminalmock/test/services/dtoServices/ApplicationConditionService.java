package com.terminalmock.test.services.dtoServices;

import com.terminalmock.test.entities.dto.Application_condition;
import com.terminalmock.test.repositories.dtorepo.ApplicationConditionRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationConditionService {
    private final ApplicationConditionRepo application_condition_Repo;

    public ApplicationConditionService(ApplicationConditionRepo application_condition_Repo) {
        this.application_condition_Repo = application_condition_Repo;
    }

    public Application_condition getOne(long id) {
        return application_condition_Repo.findById(id).orElse(null);
    }

    public List<Application_condition> getAll() {
        return application_condition_Repo.findAll();
    }

    public void save(Application_condition application){
        application_condition_Repo.save(application);
    }

    public void delete(Long id) {
        application_condition_Repo.deleteById(id);
    }
}
