package com.terminalmock.test.entities.dictionary;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "\"D_LanguageTable\"")
public class Language {
    @Id
    @Column(name = "\"LanguageId\"")
    private String languageId;
}
