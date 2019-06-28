package com.terminalmock.test.services.dictionaryServices;

import com.terminalmock.test.entities.dictionary.IdentityCardCode;
import com.terminalmock.test.repositories.dictionaryrepo.IdentityCardCodeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IdentityCardCodeService {
    private final IdentityCardCodeRepo identityCardCodeRepo;
    @Autowired
    public IdentityCardCodeService(IdentityCardCodeRepo identityCardCodeRepo) {
        this.identityCardCodeRepo = identityCardCodeRepo;
    }

    public IdentityCardCode getOne(String id) {
        return identityCardCodeRepo.findById(id).orElse(null);
    }

    public List<IdentityCardCode> getAll() {
        return identityCardCodeRepo.findAll();
    }
}
