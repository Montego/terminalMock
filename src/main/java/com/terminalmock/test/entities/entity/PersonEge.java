package com.terminalmock.test.entities.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.terminalmock.test.entities.dictionary.AcademyYear;
import com.terminalmock.test.entities.dictionary.AddressCountryRegion;
import com.terminalmock.test.entities.dictionary.IdentityCardCode;
import com.terminalmock.test.entities.dictionary.Subject;
import com.terminalmock.test.entities.enums.ExamForm;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
//@AllArgsConstructor
@Entity
public class PersonEge {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    private String tab_ege_lastname;
    private String tab_ege_firstname;
    private String tab_ege_middlename;
    //TODO change
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "identityCardCode")
    private IdentityCardCode tab_ege_selectedIdentityCardCode;

    private String tab_ege_identityCardSeries;
    private String tab_ege_identityCardNumber;
    private LocalDate tab_ege_identityCardIssueDate;
    private String tab_ege_identityCardIssueBy;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "countryRegionId")
    private AddressCountryRegion tab_ege_info_selectedCitizenship;

//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "examForm")
//    private ExamForm tab_ege_selectedExamForm;
    private String tab_ege_selectedExamForm;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "academyYear")
    private AcademyYear tab_ege_year;

    private String tab_ege_selectedSubject;

    private int tab_ege_score;

    private boolean tab_ege_changePaspInf = false;


//    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="person_ege_id" )
    @JsonBackReference
    Person person;



    //конструктор для информативного заполения JSON
//    public PersonEge(boolean defValues) {
//
//        if (defValues) {
//            this.id                                 = (long) -1;
//            this.tab_ege_lastname                   = "";
//            this.tab_ege_firstname                  = "";
//            this.tab_ege_middlename                 = "";
//            this.tab_ege_selectedIdentityCardCode   = new IdentityCardCode(true);
//            this.tab_ege_identityCardSeries         = "";
//            this.tab_ege_identityCardNumber         = "";
//            this.tab_ege_identityCardIssueDate      = LocalDate.now();
//            this.tab_ege_identityCardIssueBy        = "";
//            this.tab_ege_info_selectedCitizenship   = new AddressCountryRegion(); //dict
//            this.tab_ege_selectedExamForm           = new ExamForm(); //enum
//            this.tab_ege_year                       = "";
//            this.tab_ege_selectedSubject            = new Subject(true);
//            this.tab_ege_score                      = -1;
//            this.tab_ege_score_fis                  = -1;
//            this.tab_ege_appelation                 = "";
//            this.person                             = new Person();
//        }
//    }

}
