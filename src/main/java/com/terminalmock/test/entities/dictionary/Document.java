package com.terminalmock.test.entities.dictionary;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "\"D_Document\"")
public class Document {
    @Id
    @Column(name = "\"DocumentId\"")
    private String documentId;
    @Column(name = "\"Name\"")
    private String name;
    @Column(name = "\"IsManual\"")
    private int isManual;
    @Column(name = "\"SerialNumberDocument\"")
    private int serialNumberDocument;
    @Column(name = "\"DocSeriesMandatory\"")
    private int docSeriesMandatory;
    @Column(name = "\"DocNumberMandatory\"")
    private int docNumberMandatory;
    @Column(name = "\"RelatedDocument\"")
    private int relatedDocument;
    @Column(name = "\"DocumentType\"")
    private int documentType;
    @Column(name = "\"IsDifferentEduCardAppl\"")
    private int isDifferentEduCardAppl;
    @Column(name = "\"EducationLevel\"")
    private int educationLevel;
    @Column(name = "\"IsAllowEditing\"")
    private int isAllowEditing;
    @Column(name = "\"DocOrgMandatory\"")
    private int docOrgMandatory;
    @Column(name = "\"IsDuplicatePermission\"")
    private int isDuplicatePermission;
    @Column(name = "\"DiplomCopy\"")
    private int diplomCopy;
}
