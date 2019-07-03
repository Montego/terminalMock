package com.terminalmock.test.entities.dictionary;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "\"D_Document\"")
public class Document {
    @Id
    @Column(name = "\"DocumentId\"")
    private String documentId;
    @Column(name = "\"Name\"")
    private String name;
    @Column(name = "\"isManual\"")
    private int isManual;
    @Column(name = "\"SerialNumberDocument\"")
    private int serialNumberDocument;
    @Column(name = "\"DocSeriesMandatory\"")
    private int docSeriesMandatory;
    @Column(name = "\"DocNumberMandatory\"")
    private int docNumberMandatory;
    @Column(name = "\"RelatedDocument\"")
    private String relatedDocument;
    @Column(name = "\"DocumentType\"")
    private int documentType;
    @Column(name = "\"isDifferentEduCardAppl\"")
    private int isDifferentEduCardAppl;
    @Column(name = "\"EducationLevel\"")
    private int educationLevel;
    @Column(name = "\"isAllowEditing\"")
    private int isAllowEditing;
    @Column(name = "\"DocOrgMandatory\"")
    private int docOrgMandatory;
    @Column(name = "\"IsDublicatePermission\"")
    private int isDuplicatePermission;
    @Column(name = "\"DiplomCopy\"")
    private int diplomCopy;


//    @ManyToMany
//    @JoinTable(
//            name = "\"D_PreferenceByDoc\"",
//            joinColumns = { @JoinColumn(name = "\"DocumentId\"") },
//            inverseJoinColumns = { @JoinColumn(name = "\"PreferenceId\"") }
//    )
//    private List<Preference> preferences;
}
