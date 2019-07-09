package com.terminalmock.test.entities.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.terminalmock.test.entities.dictionary.Speciality;
import lombok.*;

import javax.persistence.*;

@Data
//@Setter
//@Getter
//@NoArgsConstructor
//@AllArgsConstructor
//@Table(name = "ApplicationCondition")
@Entity
public class ApplicationCondition {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    //TODO переделать на данные из БД
    private String selected_faculty;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "speciality")
    private Speciality selected_speciality;

    //TODO переделать на объект
    private String selected_educationType;

    //TODO приходит "да/нет" в буль. переделать
    private String selected_agreement;
    private String selected_specialRight;
    private String selected_typeOfSpecialRight;

    private String documentBase64;


    @JoinColumn(name="application_condition_id")
    @ManyToOne(fetch = FetchType.EAGER)
    @JsonBackReference
    Application application;


//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name="condition_person_id" )
//    @JsonBackReference
//    Person person;


}
