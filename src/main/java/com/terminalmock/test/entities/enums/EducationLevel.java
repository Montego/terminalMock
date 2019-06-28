package com.terminalmock.test.entities.enums;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "BE_EducationLevel")
public class EducationLevel {
    @Id
    private Long id;
    private String name;
}
