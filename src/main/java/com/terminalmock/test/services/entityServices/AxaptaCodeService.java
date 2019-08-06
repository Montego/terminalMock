package com.terminalmock.test.services.entityServices;

import com.terminalmock.test.entities.entity.AxaptaCode;
import com.terminalmock.test.repositories.entityrepo.AxaptaCodeRepository;
import org.springframework.stereotype.Service;

@Service
public class AxaptaCodeService {

    private final AxaptaCodeRepository axaptaCodeRepository;

    public AxaptaCodeService(AxaptaCodeRepository axaptaCodeRepository) {
        this.axaptaCodeRepository = axaptaCodeRepository;
    }

    public void save(AxaptaCode axaptaCode) {
        axaptaCodeRepository.save(axaptaCode);
    }


}
