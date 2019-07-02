//package com.terminalmock.test.dto;
//
//import com.fasterxml.jackson.annotation.JsonBackReference;
//import com.terminalmock.test.entities.dictionary.AddressCountryRegion;
//import com.terminalmock.test.entities.dictionary.IdentityCardCode;
//import com.terminalmock.test.entities.dictionary.Subject;
//import com.terminalmock.test.entities.entity.Person;
//import com.terminalmock.test.entities.enums.ExamForm;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import javax.persistence.FetchType;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import java.time.LocalDate;
//
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//public class ResponseEgeInfo {
//    Long id;
//    private String tab_ege_lastname;
//    private String tab_ege_firstname;
//    private String tab_ege_middlename;
//
//    private IdentityCardCode tab_ege_selectedIdentityCardCode;
//
//    private String tab_ege_identityCardSeries;
//    private String tab_ege_identityCardNumber;
//    private LocalDate tab_ege_identityCardIssueDate;
//    private String tab_ege_identityCardIssueBy;
//
//    private AddressCountryRegion tab_ege_info_selectedCitizenship;
//
//    private ExamForm tab_ege_selectedExamForm;
//    private String tab_ege_year;
//
//    private Subject tab_ege_selectedSubject;
//    private int tab_ege_score;
//    private int tab_ege_score_fis;
//    private String tab_ege_appelation;
//
//
//    Long person_ege_id;
//}
