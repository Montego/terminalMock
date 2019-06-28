package com.terminalmock.test.services.enumsServices;


import com.terminalmock.test.entities.enums.SoldieryStatus;
import com.terminalmock.test.repositories.enumsrepo.SoldieryStatusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoldieryStatusService {
    private final SoldieryStatusRepo soldieryStatusRepo;
    @Autowired
    public SoldieryStatusService(SoldieryStatusRepo soldieryStatusRepo) {
        this.soldieryStatusRepo = soldieryStatusRepo;
    }

    public SoldieryStatus getOne(Long id) {
        return soldieryStatusRepo.findById(id).orElse(null);
    }

    public List<SoldieryStatus> getAll() {
        return soldieryStatusRepo.findAll();
    }
}
