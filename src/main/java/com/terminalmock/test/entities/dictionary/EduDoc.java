package com.terminalmock.test.entities.dictionary;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "D_EduDoc")
public class EduDoc {
    @Id
    private String eduDocId;

    private String name;

    private String namePrint;

    private String namePrintGen;
}
