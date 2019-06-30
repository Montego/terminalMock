package com.terminalmock.test.entities.dictionary;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
    @Column(name = "\"IsMultipleSelect\"")
    private int isMultipleSelect;
    @Column(name = "\"Priority\"")
    private int priority;
    @Column(name = "\"OlympYear\"")
    private String olympYear;
    @Column(name = "\"IsManual\"")
    private int isManual;
}
