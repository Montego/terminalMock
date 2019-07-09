package com.terminalmock.test.entities.dictionary;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "\"D_Speciality\"")
public class Speciality {
    @Id
    @Column(name = "\"SpecialityId\"")
    private String specialityId;
    @Column(name = "\"Description\"")
    private String description;
    @Column(name = "\"DeparCode\"")
    private String deparCode;
    @Column(name = "\"CodeOKSO\"")
    private String codeOKSO;
    @Column(name = "\"NormEduPeriod\"")
    private String normEduPeriod;
    @Column(name = "\"DescriptionEng\"")
    private String descriptionEng;
    @Column(name = "\"DeparCodeForeign\"")
    private String deparCodeForeign;
    @Column(name = "\"isAdmissionComm\"")
    private int isAdmissionComm;
    @Column(name = "\"EducationLevel\"")
    private int educationLevel;
    @Column(name = "\"SpecLevel\"")
    private int specLevel;

    //конструктор для информативного заполения JSON
    public Speciality(boolean defValues){

        if (defValues){

            this.specialityId       = "";
            this.description        = "";
            this.deparCode          = "";
            this.codeOKSO           = "";
            this.normEduPeriod      = "";
            this.descriptionEng     = "";
            this.deparCodeForeign   = "";
            this.isAdmissionComm    = -1;
            this.educationLevel     = -1;
            this.specLevel          = -1;

        }
    }

}
