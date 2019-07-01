package com.terminalmock.test.entities.dto;

import com.terminalmock.test.entities.enums.DocType;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Application_documents {
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


    @ManyToOne
    @JoinColumn(name="application_documents_id", nullable=false,insertable=false,updatable=false )
    private Person person_documents;

}
