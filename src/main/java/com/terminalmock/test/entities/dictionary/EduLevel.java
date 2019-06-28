package com.terminalmock.test.entities.dictionary;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "D_EduLevel")
public class EduLevel {
    @Id
    private String eduLevelId;

    private String name;

    private String levelGroupId;

    private int studentCategory;

    private int sort;

    private int educationLevel;
}
