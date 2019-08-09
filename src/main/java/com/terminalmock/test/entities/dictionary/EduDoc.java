package com.terminalmock.test.entities.dictionary;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "\"D_EduDoc\"")
public class EduDoc {
    @Id
    @Column(name = "\"EduDocId\"")
    private String eduDocId;
    @Column(name = "\"Name\"")
    private String name;
    @Column(name = "\"NamePrint\"")
    private String namePrint;
    @Column(name = "\"NamePrintGen\"")
    private String namePrintGen;


    @ManyToMany
    @JoinTable(
            name = "\"D_DocSettle\"",
            joinColumns = { @JoinColumn(name = "\"EduDocId\"") },
            inverseJoinColumns = { @JoinColumn(name = "\"DocumentId\"") })
    private List<Document> documents_eduDocs;
}
