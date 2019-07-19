package com.terminalmock.test.repositories.entityrepo;

import com.terminalmock.test.entities.entity.Application;
import com.terminalmock.test.entities.entity.ChoosenWizard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChoosenWizardRepo extends JpaRepository<ChoosenWizard, Long> {
    List<ChoosenWizard> findAllByApplication(
//            Long id
            Application id
    );
}
