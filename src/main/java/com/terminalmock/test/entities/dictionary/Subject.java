package com.terminalmock.test.entities.dictionary;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "\"D_Subject\"")
public class Subject {
    @Id
    @Column(name = "\"SubjectId\"")
    private String subjectId;
    @Column(name = "\"Name\"")
    private String name;
    @Column(name = "\"OrderBy\"")
    private int orderBy;
    @Column(name = "\"MinScore\"")
    private int minScore;
    @Column(name = "\"IsEGE\"")
    private int isEGE;
    @Column(name = "\"Cipher\"")
    private String cipher;
}
