package com.terminalmock.test.entities.dto;


import com.terminalmock.test.entities.enums.DeliveryType;
import com.terminalmock.test.entities.enums.DocType;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
public class Application_dto implements Serializable {
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

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "application_dto",cascade = CascadeType.ALL)
    Set<Application_condition_dto> application_condition_dto;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "application_dto",cascade = CascadeType.ALL)
    Set<Application_documents_dto> application_documents_dto;
    //application_documents массив

    private int score_russian;

    private int score_chemistry;

    private int score_biology;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn
    Person_dto person_dto;
}
