package com.terminalmock.test.entities.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.terminalmock.test.entities.enums.DeliveryType;
import com.terminalmock.test.entities.enums.DocType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    private LocalDate application_date;

    private String saved;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "application_document_id")
    @JsonManagedReference
    private Set<ApplicationDocuments> application_documents;
    private String application_number;
    private String application_person_name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "deliveryType")
    private DeliveryType application_selectedDeliveryType;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "deliveryReturnType")
    private DeliveryType application_selectedDeliveryReturnType;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "docType")
    private DocType application_selectedDocType;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "application_condition_id")
    @JsonManagedReference
    private Set<ApplicationCondition> application_condition;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "application_wizard_id")
    @JsonManagedReference
    private Set<ChoosenWizard> choosenWizards;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "person_id")
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
