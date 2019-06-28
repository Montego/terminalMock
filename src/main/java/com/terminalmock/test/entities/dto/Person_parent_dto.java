package com.terminalmock.test.entities.dto;


import com.terminalmock.test.entities.dictionary.FamRelationShip;
import com.terminalmock.test.entities.enums.Gender;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class Person_parent_dto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    private String tab_parent_name;
    //TODO change
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "famRelationShip")
    private FamRelationShip tab_parent_selectedFamRelationShip;
    private String tab_parent_lastname;
    private String tab_parent_firstname;
    private String tab_parent_middlename;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "gender")
    private Gender tab_parent_selectedGender;
    private LocalDate tab_parent_birthDate;

    private String tab_parent_organization_name;
    private String tab_parent_organization_address;
    private String tab_parent_organization_seniority;
    private int tab_parent_organization_employYears;
    private String tab_parent_homePhoneNumber;
    private String tab_parent_cellularPhone;
    private String tab_parent_factAddress;

    @ManyToOne
    @JoinColumn
    Person_dto person_dto;

}
