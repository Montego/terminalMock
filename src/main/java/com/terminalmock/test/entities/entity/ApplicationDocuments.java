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

    private String nameDoc;
    private String serialDoc;
    private String numberDoc;
    private String fullnameDoc;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "docType")
    private DocType docTypeDoc;
    private LocalDate dateOfIssueDoc;
    private int countDoc = 0;
    private String IssuedByDoc;
//    private String tab_document_selectedDocumentType;
//    private int tab_document_count;
//    private String tab_document_series;
//    private String tab_document_number;
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "docType")
//    private DocType tab_document_selectedDocType;
//    private LocalDate tab_document_date;
//    private String tab_document_issuedBy;
//    private String fullName;

    @JoinColumn(name="application_document_id")
    @ManyToOne(fetch = FetchType.EAGER)
    @JsonBackReference
    Application application;


//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name="document_person_id" )
//    @JsonBackReference
//    private Person person_documents;

    //конструктор для информативного заполения JSON
//    public ApplicationDocuments(boolean defValues) {
//
//        if (defValues) {
//
//            this.id                                 = (long) -1;
//            this.tab_document_selectedDocumentType  = "";
//            this.tab_document_count                 = -1;
//            this.tab_document_series                = "";
//            this.tab_document_number                = "";
//            this.tab_document_selectedDocType       = new DocType(); //enum
//            this.tab_document_date                  = LocalDate.now();
//            this.tab_document_issuedBy              = "";
//            this.fullName                           = "";
//            this.application                        = new Application();
//
//        }
//    }

}

