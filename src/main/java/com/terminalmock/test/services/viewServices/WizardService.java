package com.terminalmock.test.services.viewServices;

import com.terminalmock.test.entities.view.Wizard;
import com.terminalmock.test.repositories.viewrepo.WizardRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WizardService {

    private final WizardRepo wizardRepo;

    public WizardService(WizardRepo wizardRepo) {
        this.wizardRepo = wizardRepo;
    }

    public List<Wizard> getAll() {
        return wizardRepo.findAll();
    }

    public Wizard getOne(Long id) {
        return wizardRepo.getOne(id);
    }

}
