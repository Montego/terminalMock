package com.terminalmock.test.entities.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Table(name = "Person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String acceptedPerson;
//    private String saved;
//from evidence_ege tab
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="person_ege_id")
    @JsonManagedReference
    private Set<PersonEge> ege_info;

    //from parent tab
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="person_parent_id")
    @JsonManagedReference
    private Set<PersonParent> parents_info;

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name="person_personInfo_id")
//    @JsonManagedReference
//    private Set<PersonInfo> person_info;
//    @OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
//    @OneToOne(optional = false, mappedBy="person")

    @OneToOne(cascade=CascadeType.ALL, mappedBy= "person")
    @JsonManagedReference
    private PersonInfo person_info;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="person_futureInfo_id")
    @JsonManagedReference
    private List<PersonFutures> futures_info;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="person_application_id")
    @JsonManagedReference
    private List<Application> applications;

    //конструктор для информативного заполения JSON
//    public Person(boolean defValues) {
//
//        if (defValues) {
//
//            this.id = (long) -1;
//
//            HashSet<PersonEge> defSetPE = new HashSet<>();
//            defSetPE.add(new PersonEge(true));
//
//            this.ege_info = defSetPE;
//
//            HashSet<PersonParent> defSetPP = new HashSet<>();
//            defSetPP.add(new PersonParent(true));
//
//            this.parents_info = defSetPP;
//
//            HashSet<PersonInfo> defSetPI = new HashSet<>();
//            defSetPI.add(new PersonInfo(true));
//
//            this.person_info = defSetPI;
//
//            HashSet<PersonFutures> defSetPF = new HashSet<>();
//            defSetPF.add(new PersonFutures(true));
//
//            this.futures_info = defSetPF;
//
//            ArrayList<Application> app = new ArrayList<>();
//            app.add(new Application(true));
//
//            this.applications = app;
//
//        }
//    }
}
