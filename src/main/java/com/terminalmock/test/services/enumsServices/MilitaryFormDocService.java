package com.terminalmock.test.services.enumsServices;


import com.terminalmock.test.entities.enums.MilitaryFormDoc;
import com.terminalmock.test.repositories.enumsrepo.MilitaryFormDocRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MilitaryFormDocService {
    private final MilitaryFormDocRepo militaryFormDocRepo;
    @Autowired
    public MilitaryFormDocService(MilitaryFormDocRepo militaryFormDocRepo) {
        this.militaryFormDocRepo = militaryFormDocRepo;
    }

    public MilitaryFormDoc getOne(Long id) {
        return militaryFormDocRepo.findById(id).orElse(null);
    }

    public List<MilitaryFormDoc> getAll() {
        return militaryFormDocRepo.findAll();
    }
}
