package com.terminalmock.test.entities.dictionary;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "\"D_QualificationLevel\"")
public class QualificationLevel {
    @Id
    @Column(name = "\"QualificationLevelId\"")
    private String qualificationLevelId;
    @Column(name = "\"Name\"")
    private String name;
}
