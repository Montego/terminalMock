package com.terminalmock.test.services.dictionaryServices;


import com.terminalmock.test.entities.dictionary.Document;
import com.terminalmock.test.repositories.dictionaryrepo.DocumentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentService {
    private final DocumentRepo documentRepo;
    @Autowired
    public DocumentService(DocumentRepo documentRepo) {
        this.documentRepo = documentRepo;
    }

    public Document getOne(String id) {
        return documentRepo.findById(id).orElse(null);
    }

    public List<Document> getAll() {
        return documentRepo.findAll();
    }
}
