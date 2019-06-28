package com.terminalmock.test.entities.dictionary;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "D_AcadamyYear")
public class AcademyYear {
    @Id
    private String academyYearId;

    private String description;

    private LocalDate beginPeriod;

    private LocalDate endPerion;

}
