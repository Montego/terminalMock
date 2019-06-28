package com.terminalmock.test.entities.dictionary;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "D_HighSchool")
public class HighSchool {
    @Id
    private String highSchoolId;

    private String name;

    private String shortName;

    private int studentCategory;

    private int sorting;

    private String currentHighSchoolId;
}
