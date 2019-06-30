package com.terminalmock.test.entities.dictionary;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "\"D_AcadamyYear\"")
public class AcademyYear {
    @Id
    @Column(name = "\"AcademyYearId\"")
    private String academyYearId;
    @Column(name = "\"Description\"")
    private String description;
    @Column(name = "\"BeginPeriod\"")
    private LocalDate beginPeriod;
    @Column(name = "\"EndPeriod\"")
    private LocalDate endPeriod;

}
