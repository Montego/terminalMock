package com.terminalmock.test.services.enumsServices;

import com.terminalmock.test.entities.enums.AttrType;
import com.terminalmock.test.repositories.enumsrepo.AttrTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttrTypeService {
    private final AttrTypeRepo attrTypeRepo;
    @Autowired
    public AttrTypeService(AttrTypeRepo attrTypeRepo) {
        this.attrTypeRepo = attrTypeRepo;
    }

    public AttrType getOne(Long id) {
        return attrTypeRepo.findById(id).orElse(null);
    }

    public List<AttrType> getAll() {
        return attrTypeRepo.findAll();
    }
}
