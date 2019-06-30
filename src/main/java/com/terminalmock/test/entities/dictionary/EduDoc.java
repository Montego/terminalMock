package com.terminalmock.test.entities.dictionary;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "\"D_EduDoc\"")
public class EduDoc {
    @Id
    @Column(name = "\"EduDocId\"")
    private String eduDocId;
    @Column(name = "\"Name\"")
    private String name;
    @Column(name = "\"NamePrint\"")
    private String namePrint;
    @Column(name = "\"NamePrintGen\"")
    private String namePrintGen;
}
