package com.terminalmock.test.entities.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.terminalmock.test.entities.enums.ExamForm;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SubjectScore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String subjectId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="person_subjectScore" )
    @JsonBackReference
    private Person person;

    private int examPoint;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "examForm")
    private ExamForm examForm;
}
