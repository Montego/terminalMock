package com.terminalmock.test.entities.dictionary;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "D_Preference")
public class Preference {
    @Id
    private String preferenceId;

    private String name;

    private int attrType;

    private int prefType;

    private String prefGroupId;

    private int prefDocQty;

    private int educationLevel;

    private int points;

    private int isMultipleSelect;

    private int priority;

    private String OlympYear;

    private int isManual;
}
