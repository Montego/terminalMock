package com.terminalmock.test.services.enumsServices;

import com.terminalmock.test.entities.enums.PrefType;
import com.terminalmock.test.repositories.enumsrepo.PrefTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrefTypeService {
    private final PrefTypeRepo prefTypeRepo;
    @Autowired
    public PrefTypeService(PrefTypeRepo prefTypeRepo) {
        this.prefTypeRepo = prefTypeRepo;
    }

    public PrefType getOne(Long id) {
        return prefTypeRepo.findById(id).orElse(null);
    }

    public List<PrefType> getAll() {
        return prefTypeRepo.findAll();
    }
}


