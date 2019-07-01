package com.terminalmock.test.entities.dto;

import com.terminalmock.test.entities.dictionary.Speciality;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

//@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Application_condition")
@Entity
public class Application_condition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @ManyToOne(optional = false)
    @JoinColumn(name = "person_id")
    Person person;


}
