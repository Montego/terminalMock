package com.terminalmock.test.entities.dictionary;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "D_Subject")
public class Subject {
    @Id
    private String subjectId;

    private String name;

    private int orderBy;

    private int minScore;

    private int isEGE;

    private String cipher;
}
