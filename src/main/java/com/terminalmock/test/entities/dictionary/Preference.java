package com.terminalmock.test.entities.dictionary;

import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
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
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "\"EducationLevel\"")
//    private EduLevel educationLevel;


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

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "\"D_PreferenceByDoc\"",
            joinColumns = { @JoinColumn(name = "\"PreferenceId\"") },
            inverseJoinColumns = { @JoinColumn(name = "\"DocumentId\"") }
    )
    private List<Document> documents;

    @ManyToMany(fetch = FetchType.EAGER)
    @Fetch(FetchMode.SELECT)
    @JoinTable(
            name = "\"D_PKSubjectsCompetitions\"",
            joinColumns = {@JoinColumn(name = "\"PreferenceId\"")},
            inverseJoinColumns = {@JoinColumn(name = "\"SubjectId\"")}
    )
    private List<Subject> subjects;

//    @ManyToMany
//    @JoinTable(
//            name = "\"PreferenceByEduLevel\"",
//            joinColumns = { @JoinColumn(name = "\"PreferenceId\"") },
//            inverseJoinColumns = { @JoinColumn(name = "\"EduLevelId\"") }
//    )
//    private List<EduLevel> eduLevels;
}
