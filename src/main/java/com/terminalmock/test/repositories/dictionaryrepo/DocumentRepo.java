package com.terminalmock.test.repositories.dictionaryrepo;

import com.terminalmock.test.entities.dictionary.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface DocumentRepo extends JpaRepository<Document, String> {

//    List<Document> findAllByPreferences_PreferenceId(String id);

//
//
//    @Query("select all from Document left join Preference on Document.documentId = " +
//            "Preference.preferenceId where preferenceId = " )
//    List<Document> findAllByPreferencesInPrefe_PreferenceId(String id);

}
