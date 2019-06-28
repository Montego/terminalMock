package com.terminalmock.test.entities.dictionary;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "D_DocumentKind")
public class DocumentKind {
    @Id
    private String documentKindId;

    private String documentId;

    private String name;
}
