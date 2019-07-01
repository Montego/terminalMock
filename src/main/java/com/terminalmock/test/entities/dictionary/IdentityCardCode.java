package com.terminalmock.test.entities.dictionary;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "\"D_IdentityCardTable\"")
public class IdentityCardCode {
    @Id
    @Column(name = "\"IdentityCardCode\"")
    private String identityCardCode;
    @Column(name = "\"IdentityCardNamemiddle\"")
    private String identityCardNamemiddle;
    @Column(name = "\"IdentityCardNameFull\"")
    private String identityCardNameFull;
    @Column(name = "\"IdentityCardNameShort\"")
    private String identityCardNameShort;
    @Column(name = "\"isUniversity\"")
    private int isUniversity;
    @Column(name = "\"isMandatory_Number\"")
    private int isMandatory_Number;
    @Column(name = "\"isMandatory_Series\"")
    private int isMandatory_Series;
    @Column(name = "\"Sort\"")
    private int sort;
}
