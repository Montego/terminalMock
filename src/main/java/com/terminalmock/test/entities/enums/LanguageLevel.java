package com.terminalmock.test.entities.enums;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "BE_LanguageLevel")
public class LanguageLevel {
    @Id
    private Long id;
    private String name;
}
