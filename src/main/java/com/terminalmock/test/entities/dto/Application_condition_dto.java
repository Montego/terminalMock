package com.terminalmock.test.entities.dto;

import com.terminalmock.test.entities.dictionary.Speciality;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class Application_condition_dto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    //TODO переделать на данные из БД
    private String selected_faculty;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "speciality")
    private Speciality selected_specialty;
    //TODO переделать на объект
    private String selected_educationType;


    //TODO приходит "да/нет" в буль. переделать
    private String selected_agreement;
    private String selected_specialRight;
    private String selected_typeOfSpecialRight;

    private String documentBase64;

    @ManyToOne
    @JoinColumn
    Application_dto application_dto;


}
