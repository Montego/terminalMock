package com.terminalmock.test.entities.dictionary;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "\"D_AcadamyYear\"")
public class AcademyYear {
    @Id
    @OrderBy("name DESC")
    @Column(name = "\"AcadamyYearId\"")
    private String academyYearId;
    @Column(name = "\"Description\"")
    private String description;
    @Column(name = "\"BeginPeriod\"")
    private LocalDate beginPeriod;
    @Column(name = "\"EndPeriod\"")
    private LocalDate endPeriod;

}
