package com.terminalmock.test.entities.dto;


import com.terminalmock.test.entities.dictionary.*;
import com.terminalmock.test.entities.enums.*;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
public class Person_dto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
//from personal data tab
    private String tab_personal_lastname;
    private String tab_personal_firstname;
    private String tab_personal_middlename;
    private String tab_personal_contactPersonNameGenitive;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "gender")
    private Gender tab_personal_selectedGender;
    private LocalDate tab_personal_birthDate;
    private String tab_personal_INIPA;
    private LocalDate tab_personal_INIPADate;
    private String tab_personal_note;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "identityCardCode")
    private IdentityCardCode tab_personal_selectedIdentityCardCode;
    private String tab_personal_identityCardSeries;
    private String tab_personal_identityCardNumber;
    private String tab_personal_identityCardIssueBy;
    private LocalDate tab_personal_identityCardIssueDate;
    private String tab_personal_identityCardIssueDep;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "addressCountryRegion" ,insertable = false, updatable = false)
    private AddressCountryRegion tab_personal_selectedCitizenship;
    private boolean tab_personal_isCompatriot;
    private boolean tab_personal_isEquatedForeign;
    private String tab_personal_birthplace;
    private boolean tab_personal_isHostel;
    private boolean tab_personal_isForeignLikeRussian;

    private String tab_personal_homePhoneNumber;
    private String tab_personal_cellularPhone;
    private String tab_personal_email;
    private String tab_personal_company;
    private String tab_personal_company_address;
    private String tab_personal_seniority;
    private int tab_personal_employYears;
    private int tab_personal_employMonths;
    private int tab_personal_employDays;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "langInfo")
    private LangInfo tab_personal_selectedForeignLanguageInfo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "language1")
    private Language tab_personal_selectedLanguage1;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "languageLevel1")
    private LanguageLevel tab_personal_selectedLanguageLevel1;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "language2")
    private Language tab_personal_selectedLanguage2;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "languageLevel2")
    private LanguageLevel tab_personal_selectedLanguageLevel2;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "language3")
    private Language tab_personal_selectedLanguage3;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "languageLevel3")
    private LanguageLevel tab_personal_selectedLanguageLevel3;
//from address tab
    private String tab_address_registrationAddress;
    private String tab_address_factAddress;
    private String tab_address_templateRegistrationAddress;

//from evidence_ege tab
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "person_dto",cascade = CascadeType.ALL)
    private Set<Person_ege_dto> ege_info;
//from graduate_military tab
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "educationLevel")
    private EducationLevel tab_edu_military_educationLevel;
    private String tab_edu_military_univer;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "addressCountryRegion")
    private AddressCountryRegion tab_edu_military_selectedCountryRegion;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "addressState")
    private AddressState tab_edu_military_selectedState;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "academyYear")
    private AcademyYear tab_edu_military_selectedAcademyYear;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "eduDoc")
    private EduDoc tab_edu_military_selectedEduDoc;
    private String tab_edu_military_eduDocSerial;
    private String tab_edu_military_eduDocNumber;
    private LocalDate tab_edu_military_eduDocDate;
    private String tab_edu_military_eduDocName;
    private String tab_edu_military_attachment_serial;
    private String tab_edu_military_attachment_number;
    private String averageScore;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "soldiery")
    private Soldiery tab_edu_military_selectedSoldiery;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "soldieryStatus")
    private SoldieryStatus tab_edu_military_selectedSoldieryStatus;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "militaryFormDoc")
    private MilitaryFormDoc tab_edu_military_selectedMilitaryFormDoc;
    private String tab_edu_military_militaryNumber;
    private String tab_edu_military_militarySeries;
    private LocalDate tab_edu_military_militaryIssueDate;
    private String tab_edu_military_militaryIssueBy;
    private String tab_edu_military_militaryRank;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "docType")
    private DocType tab_edu_military_selectedDocType;
    private LocalDate tab_edu_military_docMilitaryShowDate;
    private LocalDate tab_edu_military_startMilitary;
    private LocalDate tab_edu_military_endMilitary;
//    private ???? selectedExtraInfos1;
//    private ???? selectedExtraInfos2;
//    private ???? selectedExtraInfos3;
//    private ???? selectedExtraInfos4;
//    private ???? extraInfosDescription1;
//    private ???? extraInfosDescription2;
//    private ???? extraInfosDescription3;
//    private ???? extraInfosDescription4;

    //from parent tab
//    @OneToMany(mappedBy="person_parent")
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "person_dto",cascade = CascadeType.ALL)
    private Set<Person_parent_dto> parents_info;

    private String photo;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "person_dto",cascade = CascadeType.ALL)
//    @OneToMany(mappedBy="person_application",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Application_dto> application_dto;
}
