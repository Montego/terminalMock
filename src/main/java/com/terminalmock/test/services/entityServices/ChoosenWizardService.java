package com.terminalmock.test.services.entityServices;

import com.terminalmock.test.entities.entity.ChoosenWizard;
import com.terminalmock.test.repositories.entityrepo.ChoosenWizardRepo;
import com.terminalmock.test.repositories.viewrepo.WizardRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChoosenWizardService {
    private final ChoosenWizardRepo choosenWizardRepo;

    public ChoosenWizardService(ChoosenWizardRepo choosenWizardRepo) {
        this.choosenWizardRepo = choosenWizardRepo;
    }

    public void save(ChoosenWizard choosenWizard){
        choosenWizardRepo.save(choosenWizard);
    }

//    public void getAll(Long id){
//        choosenWizardRepo.findAllByApplication(id);
//    }

    public void saveList(List<ChoosenWizard> choosens){
        for(ChoosenWizard choosen : choosens) {
            choosenWizardRepo.save(choosen);
        }
    }
}
