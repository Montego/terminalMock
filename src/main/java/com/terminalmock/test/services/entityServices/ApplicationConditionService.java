package com.terminalmock.test.services.entityServices;

import com.terminalmock.test.entities.entity.ApplicationCondition;
import com.terminalmock.test.repositories.entityrepo.ApplicationConditionRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationConditionService {
    private final ApplicationConditionRepo application_condition_Repo;

    public ApplicationConditionService(ApplicationConditionRepo application_condition_Repo) {
        this.application_condition_Repo = application_condition_Repo;
    }

    public ApplicationCondition getOne(long id) {
        return application_condition_Repo.findById(id).orElse(null);
    }

    public List<ApplicationCondition> getAll() {
        return application_condition_Repo.findAll();
    }

    public void save(ApplicationCondition application){
        application_condition_Repo.save(application);
    }

    public void delete(Long id) {
        application_condition_Repo.deleteById(id);
    }
}
