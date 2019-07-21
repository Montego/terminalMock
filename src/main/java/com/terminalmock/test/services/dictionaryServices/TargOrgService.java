package com.terminalmock.test.services.dictionaryServices;

import com.terminalmock.test.entities.dictionary.TargOrg;
import com.terminalmock.test.repositories.dictionaryrepo.TargOrgRepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TargOrgService {
    private final TargOrgRepo targOrgRepo;

    public TargOrgService(TargOrgRepo targOrgRepo) {
        this.targOrgRepo = targOrgRepo;
    }

    public TargOrg getOne(String id) {
        return targOrgRepo.findById(id).orElse(null);
    }

    public List<TargOrg> getAll() {
        return targOrgRepo.findAll();
    }
}
