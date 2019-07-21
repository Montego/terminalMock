package com.terminalmock.test.entities.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.terminalmock.test.entities.dictionary.FamRelationShip;
import com.terminalmock.test.entities.entity.address.AddressCellBasedDto;
import com.terminalmock.test.entities.entity.address.PersonParentAddress;
import com.terminalmock.test.entities.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class PersonParent {
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

    @JoinColumn(name="person_parent_id")
    @ManyToOne(fetch = FetchType.EAGER)
    @JsonBackReference
    Person person;

    //конструктор для информативного заполения JSON
    public PersonParent(boolean defValues) {

        if (defValues) {
            this.id                                     = (long) -1;
            this.tab_parent_name                        = "";
            this.tab_parent_selectedFamRelationShip     = new FamRelationShip();
            this.tab_parent_lastname                    = "";
            this.tab_parent_firstname                   = "";
            this.tab_parent_middlename                  = "";
            this.tab_parent_selectedGender              = new Gender(); //enum
            this.tab_parent_birthDate                   = LocalDate.now();
            this.tab_parent_organization_name           = "";
            this.tab_parent_organization_address        = "";
            this.tab_parent_organization_seniority      = "";
            this.tab_parent_organization_employYears    = -1;
            this.tab_parent_homePhoneNumber             = "";
            this.tab_parent_cellularPhone               = "";
            this.tab_parent_factAddress                 = "";
            this.person                                 = new Person();
        }

    }

    @OneToOne(orphanRemoval = true, cascade = CascadeType.ALL, mappedBy = "personParent")
    @JsonManagedReference
    private PersonParentAddress address;

    @Transient
    private AddressCellBasedDto addressDto;

}
