package com.terminalmock.test.entities.dto;


import com.terminalmock.test.entities.dictionary.AddressCountryRegion;
import com.terminalmock.test.entities.dictionary.IdentityCardCode;
import com.terminalmock.test.entities.dictionary.Subject;
import com.terminalmock.test.entities.enums.ExamForm;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class Person_ege_dto {
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
    @JoinColumn(name = "addressCountryRegion")
    private AddressCountryRegion tab_ege_info_selectedCitizenship;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "examForm")
    private ExamForm tab_ege_selectedExamForm;
    private String tab_ege_year;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "subject")
    private Subject tab_ege_selectedSubject;
    private int tab_ege_score;
    private int tab_ege_score_fis;
    private String tab_ege_appelation;

    @ManyToOne
    @JoinColumn
    Person_dto person_dto;
}
