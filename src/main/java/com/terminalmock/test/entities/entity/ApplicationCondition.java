package com.terminalmock.test.entities.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.terminalmock.test.entities.dictionary.Speciality;
import lombok.*;

import javax.persistence.*;

//@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
//@Table(name = "ApplicationCondition")
@Entity
public class ApplicationCondition {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    //TODO переделать на данные из БД
    private String selected_faculty;

//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "speciality")
//    private Speciality selected_speciality;

    private String selected_speciality;

    //TODO переделать на объект
    private String selected_educationType;

    //TODO приходит "да/нет" в буль. переделать
    private String selected_agreement;
    private String selected_specialRight;
    private String selected_typeOfSpecialRight;
    private String proof_special_right_serial;
    private String proof_special_right_number;

    private String documentBase64;


    @JoinColumn(name="application_condition_id")
    @ManyToOne(fetch = FetchType.EAGER)
    @JsonBackReference
    Application application;




    //конструктор для информативного заполения JSON
//    public ApplicationCondition(boolean defValues){
//
//        if (defValues){
//
//            this.id                             = -1;
//            this.selected_faculty               = "";
//            this.selected_speciality            = new Speciality(true);
//            this.selected_educationType         = "";
//            this.selected_agreement             = "";
//            this.selected_specialRight          = "";
//            this.selected_typeOfSpecialRight    = "";
//            this.documentBase64                 = "";
//            this.application                    = new Application();
//        }
//    }

}
