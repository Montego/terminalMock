package com.terminalmock.test.entities.dictionary;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "D_Speciality")
public class Speciality {
    @Id
    private String specialityId;

    private String description;

    private String deparCode;

    private String codeOKSO;

    private String normEduPeriod;

    private String descriptionEng;

    private String deparCodeForeign;

    private int isAdmissionComm;

    private int educationLevel;

    private int specLevel;

}
