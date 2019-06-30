package com.terminalmock.test.entities.dictionary;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "\"D_HighSchool\"")
public class HighSchool {
    @Id
    @Column(name = "\"HighSchoolId\"")
    private String highSchoolId;
    @Column(name = "\"Name\"")
    private String name;
    @Column(name = "\"ShortName\"")
    private String shortName;
    @Column(name = "\"StudentCategory\"")
    private int studentCategory;
    @Column(name = "\"Sorting\"")
    private int sorting;
    @Column(name = "\"CurrentHighSchoolId\"")
    private String currentHighSchoolId;
}
