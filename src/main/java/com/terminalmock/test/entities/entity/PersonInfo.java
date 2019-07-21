package com.terminalmock.test.entities.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.terminalmock.test.entities.dictionary.*;
import com.terminalmock.test.entities.entity.address.AddressCellBasedDto;
import com.terminalmock.test.entities.entity.address.PersonAddress;
import com.terminalmock.test.entities.enums.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "person_info")
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
    @JoinColumn(name = "addressCountryRegion")
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

    private int language_score1;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "language2")
    private Language selected_foreignLanguageName2;

    private int language_score2;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "language3")
    private Language selected_foreignLanguageName3;

    private int language_score3;
    //from address tab
    private String tab_address_registrationAddress;
    private String tab_address_factAddress;
    private String tab_address_templateRegistrationAddress;

//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "educationLevel")
//    private EducationLevel tab_edu_military_educationLevel;
    private String tab_edu_military_educationLevel;
//change here
    private String tab_edu_military_univer;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "addressCountryRegionEducation")
    private AddressCountryRegion tab_edu_military_selectedCountryRegion;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "addressState")
    private AddressState tab_edu_military_selectedState = null;
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
    private String showimage;

//    @JoinColumn(name="person_personInfo_id")
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JsonBackReference
//    Person person;

//    @OneToOne(fetch = FetchType.EAGER)
//    @MapsId
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="person_id")
    @JsonBackReference
//    @OneToOne(optional = false, mappedBy= "personInfo")
    Person person;

    //git test
    //конструктор для информативного заполения JSON
//    public PersonInfo(boolean defValues) {
//
//        if (defValues) {
//            this.id                                         = (long) -1;
//            this.tab_personal_lastname                      = "";
//            this.tab_personal_firstname                     = "";
//            this.tab_personal_middlename                    = "";
//            this.tab_personal_name                          = "";
//            this.tab_personal_lastname_genitive             = "";
//            this.tab_personal_firstname_genitive            = "";
//            this.tab_personal_middlename_genitive           = "";
//            this.tab_personal_contactPersonNameGenitive     = "";
//            this.tab_personal_selectedGender                = new Gender(); //enum
//            this.tab_personal_birthDate                     = LocalDate.now();
//            this.tab_personal_INIPA                         = "";
//            this.tab_personal_INIPADate                     = LocalDate.now();
//            this.tab_personal_note                          = "";
//            this.tab_personal_selectedIdentityCardCode      = new IdentityCardCode(true);
//            this.tab_personal_identityCardSeries            = "";
//            this.tab_personal_identityCardNumber            = "";
//            this.tab_personal_identityCardIssueBy           = "";
//            this.tab_personal_identityCardIssueDate         = LocalDate.now();
//            this.tab_personal_identityCardIssueDep          = "";
//            this.tab_personal_selectedCitizenship           = new AddressCountryRegion(); //dict
//            this.tab_personal_isCompatriot                  = false;
//            this.tab_personal_isEquatedForeign              = false;
//            this.tab_personal_birthplace                    = "";
//            this.tab_personal_isHostel                      = false;
//            this.tab_personal_isForeignLikeRussian          = false;
//            this.tab_personal_homePhoneNumber               = "";
//            this.tab_personal_cellularPhone                 = "";
//            this.tab_personal_email                         = "";
//            this.tab_personal_company_name                  = "";
//            this.tab_personal_company_address               = "";
//            this.tab_personal_seniority                     = "";
//            this.tab_personal_employYears                   = -1;
//            this.tab_personal_employMonths                  = -1;
//            this.tab_personal_employDays                    = -1;
//            this.tab_personal_selectedForeignLanguageInfo   = new LangInfo(); //enum
//            this.selected_foreignLanguageName1              = new Language(); //dict
//            this.language_score1                            = "";
//            this.selected_foreignLanguageName2              = new Language();
//            this.language_score2                            = "";
//            this.selected_foreignLanguageName3              = new Language();
//            this.language_score3                            = "";
//            this.tab_address_registrationAddress            = "";
//            this.tab_address_factAddress                    = "";
//            this.tab_address_templateRegistrationAddress    = "";
//            this.tab_edu_military_educationLevel            = "";
//            this.tab_edu_military_univer                    = "";
//            this.tab_edu_military_selectedCountryRegion     = new AddressCountryRegion();
//            this.tab_edu_military_selectedState             = new AddressState();
//            this.tab_edu_military_selectedAcademyYear       = new AcademyYear();
//            this.tab_edu_military_selectedEduDoc            = new EduDoc();
//            this.tab_edu_military_eduDocSerial              = "";
//            this.tab_edu_military_eduDocNumber              = "";
//            this.tab_edu_military_eduDocDate                = LocalDate.now();
//            this.tab_edu_military_eduDocName                = "";
//            this.tab_edu_military_attachment_serial         = "";
//            this.tab_edu_military_attachment_number         = "";
//            this.score_full                                 = "";
//            this.score_five                                 = "";
//            this.score_four                                 = "";
//            this.score_three                                = "";
//            this.tab_edu_military_selectedSoldiery          = new Soldiery(); //dict
//            this.tab_edu_military_selectedSoldieryStatus    = new SoldieryStatus(); //enum
//            this.tab_edu_military_selectedMilitaryFormDoc   = new MilitaryFormDoc(); //enum
//            this.tab_edu_military_militaryNumber            = "";
//            this.tab_edu_military_militarySeries            = "";
//            this.tab_edu_military_militaryIssueDate         = LocalDate.now();
//            this.tab_edu_military_militaryIssueBy           = "";
//            this.tab_edu_military_militaryRank              = "";
//            this.tab_edu_military_selectedDocType           = new DocType(); //enum
//            this.tab_edu_military_docMilitaryShowDate       = LocalDate.now();
//            this.tab_edu_military_startMilitary             = LocalDate.now();
//            this.tab_edu_military_endMilitary               = LocalDate.now();
//            this.selectedExtraInfos1                        = "";
//            this.selectedExtraInfos2                        = "";
//            this.extraInfosDescription1                     = "";
//            this.extraInfosDescription2                     = "";
//            this.image                                      = "";
//            this.person                                     = new Person();
//        }
//    }
    @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL, mappedBy = "person")
    @JsonManagedReference
    private List<PersonAddress> addresses = new ArrayList<>();

    @Transient
    private List<AddressCellBasedDto> addressesDto = new ArrayList<>();

    @Column(name = "\"modifiedBy\"")
    private String modifiedBy;
}
