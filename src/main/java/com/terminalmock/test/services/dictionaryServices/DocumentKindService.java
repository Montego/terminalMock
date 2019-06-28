package com.terminalmock.test.services.dictionaryServices;


import com.terminalmock.test.entities.dictionary.DocumentKind;
import com.terminalmock.test.repositories.dictionaryrepo.DocumentKindRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentKindService {
    private final DocumentKindRepo documentKindRepo;
    @Autowired
    public DocumentKindService(DocumentKindRepo documentKindRepo) {
        this.documentKindRepo = documentKindRepo;
    }

    public DocumentKind getOne(String id) {
        return documentKindRepo.findById(id).orElse(null);
    }

    public List<DocumentKind> getAll() {
        return documentKindRepo.findAll();
    }
}
