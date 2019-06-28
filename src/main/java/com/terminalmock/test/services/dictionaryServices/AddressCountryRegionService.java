package com.terminalmock.test.services.dictionaryServices;


import com.terminalmock.test.entities.dictionary.AddressCountryRegion;
import com.terminalmock.test.repositories.dictionaryrepo.AddressCountryRegionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressCountryRegionService {
    private final AddressCountryRegionRepo addressCountryRegionRepo;
    @Autowired
    public AddressCountryRegionService(AddressCountryRegionRepo addressCountryRegionRepo) {
        this.addressCountryRegionRepo = addressCountryRegionRepo;
    }

    public AddressCountryRegion getOne(String id) {
        return addressCountryRegionRepo.findById(id).orElse(null);
    }

    public List<AddressCountryRegion> getAll() {
        return addressCountryRegionRepo.findAll();
    }
}
