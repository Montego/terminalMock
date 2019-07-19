package com.terminalmock.test.services.viewServices;

import com.terminalmock.test.dto.ConditionsDto;
import com.terminalmock.test.entities.view.Wizard;
import com.terminalmock.test.repositories.viewrepo.WizardRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class WizardService {

    private final WizardRepo wizardRepo;

    public WizardService(WizardRepo wizardRepo) {
        this.wizardRepo = wizardRepo;
    }

    public List<Wizard> getAll() {
        System.out.println(wizardRepo.findAll().get(0).toString());

//        List<Wizard> wizards = wizardRepo.findAll();
//        List<ConditionsDto> conditionsDtos = new ArrayList<>();
//        for (int i = 0; i < wizards.size(); i++) {
//            ConditionsDto conditionsDto = new ConditionsDto(
//                    wizards.get(i).getDeparCode(),
//
//            );
//        }
        return wizardRepo.findAll();
    }

    public Wizard getOne(Long id){
        return wizardRepo.getOne(id);
    }

}
