package com.terminalmock.test.entities.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.terminalmock.test.entities.enums.DeliveryType;
import com.terminalmock.test.entities.enums.DocType;
import com.terminalmock.test.entities.view.Wizard;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
@Entity
public class Application{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    private String saved = "Не сохранено";
    //application_condition массив
    private String application_person_name;
    private String application_number;
    private LocalDate application_date;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "deliveryType")
    private DeliveryType application_selectedDeliveryType;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "docType")
    private DocType application_selectedDocType;




    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="application_condition_id")
    @JsonManagedReference
    private Set<ApplicationCondition> application_condition;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="application_document_id")
    @JsonManagedReference
    private Set<ApplicationDocuments> application_documents;


    private int score_russian;

    private int score_chemistry;

    private int score_biology;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="application_wizard_id")
    @JsonManagedReference
    private Set<ChoosenWizard> choosenWizards;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="person_id")
    @JsonBackReference
    Person person;


//    @ElementCollection
//    List<Wizard> wizards;


    //конструктор для информативного заполения JSON
//    public Application(boolean defValues){
//
//        if (defValues){
//            this.id                                 = -1;
//            this.application_person_name            = "";
//            this.application_number                 = "";
//            this.application_date                   = LocalDate.now();
//            this.application_selectedDeliveryType   = new DeliveryType();
//            this.application_selectedDocType        = new DocType();
//
////            HashSet<ApplicationCondition> defSetAC = new HashSet<>();
////            defSetAC.add(new ApplicationCondition(true));
////            this.application_condition              = defSetAC;
//
//            HashSet<ApplicationDocuments> defSetAD = new HashSet<>();
//            defSetAD.add(new ApplicationDocuments(true));
//
//            this.application_documents              = defSetAD;
//            this.score_russian                      = -1;
//            this.score_chemistry                    = -1;
//            this.score_biology                      = -1;
//            this.person                             = new Person();
//        }
//
//    }
}
