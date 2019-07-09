package com.terminalmock.test.entities.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.terminalmock.test.entities.enums.DocType;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ApplicationDocuments {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    private String tab_document_selectedDocumentType;
    private int tab_document_count;
    private String tab_document_series;
    private String tab_document_number;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "docType")
    private DocType tab_document_selectedDocType;
    private LocalDate tab_document_date;
    private String tab_document_issuedBy;
    private String fullName;

    @JoinColumn(name="application_document_id")
    @ManyToOne(fetch = FetchType.EAGER)
    @JsonBackReference
    Application application;


//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name="document_person_id" )
//    @JsonBackReference
//    private Person person_documents;

}
