package com.terminalmock.test.entities.dictionary;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "D_IdentityCardTable")
public class IdentityCardCode {
    @Id
    private String identityCardCode;

    private String identityCardNamemiddle;

    private String identityCardNameFull;

    private String identityCardNameShort;

    private int isUniversity;

    private int isMandatory_Number;

    private int isMandatory_Series;

    private int sort;
}
