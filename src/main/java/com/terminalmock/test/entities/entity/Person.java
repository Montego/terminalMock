package com.terminalmock.test.entities.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

//@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Table(name = "Person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
//from personal data tab
//    private String tab_personal_lastname;
//    private String tab_personal_firstname;
//    private String tab_personal_middlename;
//    private String tab_personal_name;
//    private String tab_personal_lastname_genitive;
//    private String tab_personal_firstname_genitive;
//    private String tab_personal_middlename_genitive;
//
//    private String tab_personal_contactPersonNameGenitive;
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "gender")
//    private Gender tab_personal_selectedGender;
//    private LocalDate tab_personal_birthDate;
//    private String tab_personal_INIPA;
//    private LocalDate tab_personal_INIPADate;
//    private String tab_personal_note;
//
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "identityCardCode")
//    private IdentityCardCode tab_personal_selectedIdentityCardCode;
//    private String tab_personal_identityCardSeries;
//    private String tab_personal_identityCardNumber;
//    private String tab_personal_identityCardIssueBy;
//    private LocalDate tab_personal_identityCardIssueDate;
//    private String tab_personal_identityCardIssueDep;
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "addressCountryRegion" ,insertable = false, updatable = false)
//    private AddressCountryRegion tab_personal_selectedCitizenship;
//    private boolean tab_personal_isCompatriot;
//    private boolean tab_personal_isEquatedForeign;
//    private String tab_personal_birthplace;
//    private boolean tab_personal_isHostel;
//    private boolean tab_personal_isForeignLikeRussian;
//
//    private String tab_personal_homePhoneNumber;
//    private String tab_personal_cellularPhone;
//    private String tab_personal_email;
//    private String tab_personal_company_name;
//    private String tab_personal_company_address;
//    private String tab_personal_seniority;
//    private int tab_personal_employYears;
//    private int tab_personal_employMonths;
//    private int tab_personal_employDays;
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "langInfo")
//    private LangInfo tab_personal_selectedForeignLanguageInfo;
//
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "language1")
//    private Language selected_foreignLanguageName1;
//
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "languageLevel1")
//    private LanguageLevel language_score1;
//
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "language2")
//    private Language selected_foreignLanguageName2;
//
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "languageLevel2")
//    private LanguageLevel language_score2;
//
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "language3")
//    private Language selected_foreignLanguageName3;
//
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "languageLevel3")
//    private LanguageLevel language_score3;
//from address tab
//    private String tab_address_registrationAddress;
//    private String tab_address_factAddress;
//    private String tab_address_templateRegistrationAddress;

//from evidence_ege tab
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="person_ege_id")
    @JsonManagedReference
    private Set<PersonEge> ege_info;
//from graduate_military tab
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "educationLevel")
//    private EducationLevel tab_edu_military_educationLevel;
//    private String tab_edu_military_univer;
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "addressCountryRegion")
//    private AddressCountryRegion tab_edu_military_selectedCountryRegion;
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "addressState")
//    private AddressState tab_edu_military_selectedState;
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "academyYear")
//    private AcademyYear tab_edu_military_selectedAcademyYear;
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "eduDoc")
//    private EduDoc tab_edu_military_selectedEduDoc;
//    private String tab_edu_military_eduDocSerial;
//    private String tab_edu_military_eduDocNumber;
//    private LocalDate tab_edu_military_eduDocDate;
//    private String tab_edu_military_eduDocName;
//    private String tab_edu_military_attachment_serial;
//    private String tab_edu_military_attachment_number;
//    private String score_full;
//    private String score_five;
//    private String score_four;
//    private String score_three;
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "soldiery")
//    private Soldiery tab_edu_military_selectedSoldiery;
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "soldieryStatus")
//    private SoldieryStatus tab_edu_military_selectedSoldieryStatus;
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "militaryFormDoc")
//    private MilitaryFormDoc tab_edu_military_selectedMilitaryFormDoc;
//    private String tab_edu_military_militaryNumber;
//    private String tab_edu_military_militarySeries;
//    private LocalDate tab_edu_military_militaryIssueDate;
//    private String tab_edu_military_militaryIssueBy;
//    private String tab_edu_military_militaryRank;
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "military_docType")
//    private DocType tab_edu_military_selectedDocType;
//    private LocalDate tab_edu_military_docMilitaryShowDate;
//    private LocalDate tab_edu_military_startMilitary;
//    private LocalDate tab_edu_military_endMilitary;
//    private ???? selectedExtraInfos1;
//    private ???? selectedExtraInfos2;
//    private ???? selectedExtraInfos3;
//    private ???? selectedExtraInfos4;
//    private ???? extraInfosDescription1;
//    private ???? extraInfosDescription2;
//    private ???? extraInfosDescription3;
//    private ???? extraInfosDescription4;

    //from parent tab
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="person_parent_id")
    @JsonManagedReference
    private Set<PersonParent> parents_info;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="person_personInfo_id")
    @JsonManagedReference
    private Set<PersonInfo> person_info;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="person_futureInfo_id")
    @JsonManagedReference
    private Set<PersonFutures> futures_info;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="person_application_id")
    @JsonManagedReference
    private Set<Application> applications;

//    private String photo;

//    private String application_number;
//    private LocalDate application_date;
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "application_deliveryType")
//    private DeliveryType application_selectedDeliveryType;
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "application_docType")
//    private DocType application_selectedDocType;
//    private boolean budget = false;
//    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
////    @JoinColumn(name="condition_person_id")
//    @JsonManagedReference
//    private Set<ApplicationCondition> application_condition;
//
//    //work
//    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
////    @JoinColumn(name="application_documents_id")
//    @JsonManagedReference
//    private Set<ApplicationDocuments> application_documents;

}
