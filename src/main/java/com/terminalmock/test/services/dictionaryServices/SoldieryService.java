package com.terminalmock.test.services.dictionaryServices;


import com.terminalmock.test.entities.dictionary.Soldiery;
import com.terminalmock.test.repositories.dictionaryrepo.SoldieryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoldieryService {
    private final SoldieryRepo soldieryRepo;
    @Autowired
    public SoldieryService(SoldieryRepo soldieryRepo) {
        this.soldieryRepo = soldieryRepo;
    }

    public Soldiery getOne(String id) {
        return soldieryRepo.findById(id).orElse(null);
    }

    public List<Soldiery> getAll() {
        return soldieryRepo.findAll();
    }
}
