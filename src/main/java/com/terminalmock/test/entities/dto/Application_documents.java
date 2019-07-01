package com.terminalmock.test.entities.dto;

import com.terminalmock.test.entities.enums.DocType;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
@Getter
@Setter
@Entity
public class Application_documents {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

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

//    @ManyToOne
//    @JoinColumn(name = "person")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id")
    Person person;


}
