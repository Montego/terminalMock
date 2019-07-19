package com.terminalmock.test.repositories.viewrepo;

import com.terminalmock.test.entities.view.Wizard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WizardRepo extends JpaRepository<Wizard, Long> {

}
