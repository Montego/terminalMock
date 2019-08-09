package com.terminalmock.test.repositories.dictionaryrepo;

import com.terminalmock.test.entities.dictionary.Document;
import com.terminalmock.test.entities.dictionary.EduDoc;
import com.terminalmock.test.entities.dictionary.Preference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public interface DocumentRepo extends JpaRepository<Document, String> {

    List<Document> findAllByPreferences(Collection<Preference> preferences);

    List<Document> findAllByEduDocs(Collection<EduDoc>eduDocs);







}
