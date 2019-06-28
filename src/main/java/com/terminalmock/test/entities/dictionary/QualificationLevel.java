package com.terminalmock.test.entities.dictionary;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "D_QualificationLevel")
public class QualificationLevel {
    @Id
    private String qualificationLevelId;

    private String name;
}
