package com.terminalmock.test.entities.dictionary;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "\"D_DocumentKind\"")
public class DocumentKind {
    @Id
    @Column(name = "\"DocumentKindId\"")
    private String documentKindId;
    @Column(name = "\"DocumentId\"")
    private String documentId;
    @Column(name = "\"Name\"")
    private String name;
}
