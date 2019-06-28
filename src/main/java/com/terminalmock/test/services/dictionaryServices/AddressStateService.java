package com.terminalmock.test.services.dictionaryServices;


import com.terminalmock.test.entities.dictionary.AddressState;
import com.terminalmock.test.repositories.dictionaryrepo.AddressStateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressStateService {
    private final AddressStateRepo addressStateRepo;
    @Autowired
    public AddressStateService(AddressStateRepo addressStateRepo) {
        this.addressStateRepo = addressStateRepo;
    }

    public AddressState getOne(String id) {
        return addressStateRepo.findById(id).orElse(null);
    }

    public List<AddressState> getAll() {
        return addressStateRepo.findAll();
    }
}
