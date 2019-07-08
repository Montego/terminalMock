package com.terminalmock.test.entities.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.terminalmock.test.entities.dictionary.*;
import com.terminalmock.test.entities.enums.*;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class PersonInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    private String tab_personal_lastname;
    private String tab_personal_firstname;
    private String tab_personal_middlename;
    private String tab_personal_name;
    private String tab_personal_lastname_genitive;
    private String tab_personal_firstname_genitive;
    private String tab_personal_middlename_genitive;
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
    @JoinColumn(name = "addressCountryRegion", insertable = false, updatable = false)
    private AddressCountryRegion tab_personal_selectedCitizenship;
    private boolean tab_personal_isCompatriot;
    private boolean tab_personal_isEquatedForeign;
    private String tab_personal_birthplace;
    private boolean tab_personal_isHostel;
    private boolean tab_personal_isForeignLikeRussian;

    private String tab_personal_homePhoneNumber;
    private String tab_personal_cellularPhone;
    private String tab_personal_email;
    private String tab_personal_company_name;
    private String tab_personal_company_address;
    private String tab_personal_seniority;
    private int tab_personal_employYears=0;
    private int tab_personal_employMonths=0;
    private int tab_personal_employDays=0;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "langInfo")
    private LangInfo tab_personal_selectedForeignLanguageInfo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "language1")
    private Language selected_foreignLanguageName1;


    private String language_score1;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "language2")
    private Language selected_foreignLanguageName2;


    private String language_score2;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "language3")
    private Language selected_foreignLanguageName3;


    private String language_score3;
    //from address tab
    private String tab_address_registrationAddress;
    private String tab_address_factAddress;
    private String tab_address_templateRegistrationAddress;
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
    private String score_full;
    private String score_five;
    private String score_four;
    private String score_three;
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
    @JoinColumn(name = "military_docType")
    private DocType tab_edu_military_selectedDocType;
    private LocalDate tab_edu_military_docMilitaryShowDate;
    private LocalDate tab_edu_military_startMilitary;
    private LocalDate tab_edu_military_endMilitary;
    private String selectedExtraInfos1;
    private String selectedExtraInfos2;
    private String extraInfosDescription1;
    private String extraInfosDescription2;
    private String image;

    @JoinColumn(name="person_personInfo_id")
    @ManyToOne(fetch = FetchType.EAGER)
    @JsonBackReference
    Person person;
}
