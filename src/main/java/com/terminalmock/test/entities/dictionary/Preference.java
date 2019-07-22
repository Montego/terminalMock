package com.terminalmock.test.entities.dictionary;

import lombok.Data;

import javax.persistence.*;
import javax.print.Doc;
import java.util.List;

@Entity
@Data
@Table(name = "\"D_Preference\"")
public class Preference {
    @Id
    @Column(name = "\"PreferenceId\"")
    private String preferenceId;
    @Column(name = "\"Name\"")
    private String name;
    @Column(name = "\"AttrType\"")
    private int attrType;
    @Column(name = "\"PrefType\"")
    private int prefType;
    @Column(name = "\"PrefGroupId\"")
    private String prefGroupId;
    @Column(name = "\"PrefDocQty\"")
    private int prefDocQty;
    @Column(name = "\"EducationLevel\"")
    private int educationLevel;
    @Column(name = "\"Points\"")
    private int points;
    @Column(name = "\"isMultipleSelect\"")
    private int isMultipleSelect;
    @Column(name = "\"Priority\"")
    private int priority;
    @Column(name = "\"OlympYear\"")
    private String olympYear;
    @Column(name = "\"isManual\"")
    private int isManual;

    @ManyToMany
    @JoinTable(
            name = "\"D_PreferenceByDoc\"",
            joinColumns = { @JoinColumn(name = "\"PreferenceId\"") },
            inverseJoinColumns = { @JoinColumn(name = "\"DocumentId\"") }
    )
    private List<Document> documents;
}
