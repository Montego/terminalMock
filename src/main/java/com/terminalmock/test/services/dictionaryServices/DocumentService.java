package com.terminalmock.test.services.dictionaryServices;


import com.terminalmock.test.entities.dictionary.Document;
import com.terminalmock.test.entities.dictionary.EduDoc;
import com.terminalmock.test.entities.dictionary.Preference;
import com.terminalmock.test.repositories.dictionaryrepo.DocumentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
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

    public List<Document> findAllByPreferences(Collection<Preference> preferences){
        return documentRepo.findAllByPreferences(preferences);
    }

    public List<Document> findAllDocumentByEduDoc(Collection<EduDoc> eduDocs){
        return documentRepo.findAllByEduDocs(eduDocs);
    }

//    public List<Document> findAllByPreferences(String id){
//        return documentRepo.findAllByPreferences(id);
//    }

//    public List<Document> findAllByPreferencesIsContainingPPreferenceId(String id){
//        return documentRepo.findAllByPreferences(id);
//    }
}
