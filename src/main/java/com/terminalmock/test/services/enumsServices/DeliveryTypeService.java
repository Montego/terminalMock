package com.terminalmock.test.services.enumsServices;


import com.terminalmock.test.entities.enums.DeliveryType;
import com.terminalmock.test.repositories.enumsrepo.DeliveryTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryTypeService {
    private final DeliveryTypeRepo deliveryTypeRepo;
    @Autowired
    public DeliveryTypeService(DeliveryTypeRepo deliveryTypeRepo) {
        this.deliveryTypeRepo = deliveryTypeRepo;
    }

    public DeliveryType getOne(Long id) {
        return deliveryTypeRepo.findById(id).orElse(null);
    }

    public List<DeliveryType> getAll() {
        return deliveryTypeRepo.findAll();
    }
}
