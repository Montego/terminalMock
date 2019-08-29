package com.terminalmock.test.entities.dictionary;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "\"D_EduLevel\"")
public class EduLevel {
    @Id
    @Column(name = "\"EduLevelId\"")
    private String eduLevelId;
    @Column(name = "\"Name\"")
    private String name;
    @Column(name = "\"LevelGroupId\"")
    private String levelGroupId;
    @Column(name = "\"StudentCategory\"")
    private int studentCategory;
    @Column(name = "\"Sort\"")
    private int sort;
    @Column(name = "\"EducationLevel\"")
    private int educationLevel;

//    @JsonIgnore
//    @ManyToMany(mappedBy = "eduLevels")
//    private List<Preference> preferences;
}
