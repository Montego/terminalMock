package com.terminalmock.test.services.dictionaryServices;


import com.terminalmock.test.entities.dictionary.FamRelationship;
import com.terminalmock.test.repositories.dictionaryrepo.FamRelationShipRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FamRelationShipService {
    private final FamRelationShipRepo famRelationShipRepo;
    @Autowired
    public FamRelationShipService(FamRelationShipRepo famRelationShipRepo) {
        this.famRelationShipRepo = famRelationShipRepo;
    }

    public FamRelationship getOne(String id) {
        return famRelationShipRepo.findById(id).orElse(null);
    }

    public List<FamRelationship> getAll() {
        return famRelationShipRepo.findAll();
    }
}
