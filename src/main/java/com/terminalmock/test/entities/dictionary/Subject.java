package com.terminalmock.test.entities.dictionary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "\"D_Subject\"")
public class Subject {
    @Id
    @Column(name = "\"SubjectId\"")
    private String subjectId;
    @Column(name = "\"Name\"")
    private String name;
    @Column(name = "\"OrderBy\"")
    private int orderBy;
    @Column(name = "\"MinScore\"")
    private int minScore;
    @Column(name = "\"isEGE\"")
    private int isEGE;
    @Column(name = "\"Cipher\"")
    private String cipher;

    //конструктор для информативного заполения JSON
    public Subject(boolean defValues) {

        if (defValues) {
            this.subjectId    = "";
            this.name         = "";
            this.orderBy      = -1;
            this.minScore     = -1;
            this.isEGE        = -1;
            this.cipher       = "";
        }
    }

}
