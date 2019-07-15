package com.terminalmock.test.services.enumsServices;


import com.terminalmock.test.entities.enums.DocType;
import com.terminalmock.test.repositories.enumsrepo.DocTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocTypeService {
    private final DocTypeRepo docTypeRepo;
    @Autowired
    public DocTypeService(DocTypeRepo docTypeRepo) {
        this.docTypeRepo = docTypeRepo;
    }

    public DocType getOne(int id) {
        return docTypeRepo.findById(id).orElse(null);
    }

    public List<DocType> getAll() {
        return docTypeRepo.findAll();
    }
}
