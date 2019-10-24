package com.terminalmock.test.services.viewServices;

import com.terminalmock.test.entities.view.WizardFIU;
import com.terminalmock.test.repositories.viewrepo.WizardFIURepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WizardFIUService {

    private final WizardFIURepo wizardFIURepo;

    public WizardFIUService(WizardFIURepo wizardFIURepo) {
        this.wizardFIURepo = wizardFIURepo;
    }

    public List<WizardFIU> getAll() {
        return wizardFIURepo.findAll();
    }

    public WizardFIU getOne(Long id) {
        return wizardFIURepo.getOne(id);
    }

}
