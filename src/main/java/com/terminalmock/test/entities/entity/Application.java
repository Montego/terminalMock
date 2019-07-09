package com.terminalmock.test.entities.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.terminalmock.test.entities.enums.DeliveryType;
import com.terminalmock.test.entities.enums.DocType;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
public class Application{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    //application_condition массив
    private String application_number;
    private LocalDate application_date;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "deliveryType")
    private DeliveryType application_selectedDeliveryType;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "docType")
    private DocType application_selectedDocType;

    private String fullname;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="application_condition_id")
    @JsonManagedReference
    private Set<ApplicationCondition> application_condition;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="application_document_id")
    @JsonManagedReference
    private Set<ApplicationDocuments> application_documents;


//    @OneToMany(fetch = FetchType.EAGER, mappedBy = "application",cascade = CascadeType.ALL)
//    Set<ApplicationCondition> application_condition;
//
//    @OneToMany(fetch = FetchType.EAGER, mappedBy = "application",cascade = CascadeType.ALL)
//    Set<ApplicationDocuments> application_documents;
    //application_documents массив

    private int score_russian;

    private int score_chemistry;

    private int score_biology;

    @JoinColumn(name="person_application_id")
    @ManyToOne(fetch = FetchType.EAGER)
    @JsonBackReference
    Person person;
}
