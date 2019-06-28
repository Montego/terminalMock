package com.terminalmock.test.entities.dictionary;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "D_Document")
public class Document {
    @Id
    private String documentId;

    private String name;

    private int isManual;

    private int serialNumberDocument;

    private int docSeriesMandatory;

    private int docNumberMandatory;

    private int relatedDocument;

    private int documentType;

    private int isDifferentEduCardAppl;

    private int educationLevel;

    private int isAllowEditing;

    private int docOrgMandatory;

    private int isDuplicatePermission;

    private int diplomCopy;
}
