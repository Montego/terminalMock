package com.terminalmock.test.controllers;

import com.terminalmock.test.entities.dictionary.*;
import com.terminalmock.test.services.dictionaryServices.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/dictionary")

public class DictionaryController {
    private final AcademyYearService academyYearService;
//    private final AccreditationDocService accreditationDocService;
    private final AddressCountryRegionService addressCountryRegionService;
    private final AddressStateService addressStateService;
    private final DocumentKindService documentKindService;
    private final DocumentService documentService;
//    private final EduCountryRegionService eduCountryRegionService;
    private final EduDocService eduDocService;
    private final EduLevelService eduLevelService;
    private final FamRelationShipService famRelationShipService;
    private final HighSchoolService highSchoolService;
    private final IdentityCardCodeService identityCardCodeService;
    private final LanguageService languageService;
//    private final OtherCountryRegionService otherCountryRegionService;
    private final PreferenceService preferenceService;
    private final QualificationLevelService qualificationLevelService;
    private final SoldieryService soldieryService;
    private final SpecialityService specialityService;
    private final SubjectService subjectService;
    private final TargOrgService targOrgService;
//    private final UnvSpecialityService unvSpecialityService;

    @Autowired
    public DictionaryController(AcademyYearService academyYearService,
                                AddressCountryRegionService addressCountryRegionService, AddressStateService addressStateService,
                                DocumentKindService documentKindService, DocumentService documentService,
                                EduDocService eduDocService, EduLevelService eduLevelService, FamRelationShipService famRelationShipService,
                                HighSchoolService highSchoolService, IdentityCardCodeService identityCardCodeService,
                                LanguageService languageService, PreferenceService preferenceService,
                                QualificationLevelService qualificationLevelService, SoldieryService soldieryService,
                                SpecialityService specialityService, SubjectService subjectService, TargOrgService targOrgService) {
        this.academyYearService = academyYearService;
        this.addressCountryRegionService = addressCountryRegionService;
        this.addressStateService = addressStateService;
        this.documentKindService = documentKindService;
        this.documentService = documentService;
        this.eduDocService = eduDocService;
        this.eduLevelService = eduLevelService;
        this.famRelationShipService = famRelationShipService;
        this.highSchoolService = highSchoolService;
        this.identityCardCodeService = identityCardCodeService;
        this.languageService = languageService;
        this.preferenceService = preferenceService;
        this.qualificationLevelService = qualificationLevelService;
        this.soldieryService = soldieryService;
        this.specialityService = specialityService;
        this.subjectService = subjectService;
        this.targOrgService = targOrgService;
    }

//    @GetMapping("/docByPreferenceId/{id}")
//    public List<Document> getListDocByPreferenceId(@PathVariable String id) {
//        return documentService.findAllByPreferences_PreferenceId(id);
//    }


    @GetMapping("/academyYear")
    public Iterable<AcademyYear> getListAcademyYear() {
        return academyYearService.getAll();
    }
//    @GetMapping("/accreditationDoc")
//    public List<AccreditationDoc> getListAccreditationDoc() {
//        return accreditationDocService.getAll();
//    }
    @GetMapping("/addressCountryRegion")
    public List<AddressCountryRegion> getListAddressCountryRegion() {
        return addressCountryRegionService.getAll();
    }
    @GetMapping("/addressState")
    public List<AddressState> getListAddressState() {
        return addressStateService.getAll();
    }
    @GetMapping("/documentKind")
    public List<DocumentKind> getListDocumentKind() {
        return documentKindService.getAll();
    }
    @GetMapping("/document")
    public List<Document> getListDocument() {
        return documentService.getAll();
    }

    @PostMapping("/documentByPreference/")
    public List<Document> findAllByPreferences(@RequestBody Preference preference) {
        List<Preference> prefs = new ArrayList<>();
        prefs.add(preference);
        return documentService.findAllByPreferences(prefs);
    }


//    @GetMapping("/eduCountryRegion")
//    public List<EduCountryRegion> getListEduCountryRegion() {
//        return eduCountryRegionService.getAll();
//    }
    @GetMapping("/eduDoc")
    public List<EduDoc> getListEduDoc() {
        return eduDocService.getAll();
    }
    @GetMapping("/eduLevel")
    public List<EduLevel> getListEduLevel() {
        return eduLevelService.getAll();
    }
    @GetMapping("/famRelationShip")
    public List<FamRelationShip> getListFamRelationShip() {
        return famRelationShipService.getAll();
    }
    @GetMapping("/highSchool")
    public List<HighSchool> getListHighSchool() {
        return highSchoolService.getAll();
    }
        @GetMapping("/identityCardCode")
    public List<IdentityCardCode> getListIdentityCardCode() {
        return identityCardCodeService.getAll();
    }
    @GetMapping("/language")
    public List<Language> getListLanguage() {
        return languageService.getAll();
    }
//    @GetMapping("/otherCountryRegion")
//    public List<OtherCountryRegion> getListOtherCountryRegion() {
//        return otherCountryRegionService.getAll();
//    }
    @GetMapping("/preference")
    public List<Preference> getListPreference() {
        return preferenceService.getAll();
    }


    @GetMapping("/qualificationLevel")
    public List<QualificationLevel> getList() {
        return qualificationLevelService.getAll();
    }
    @GetMapping("/soldiery")
    public List<Soldiery> getListSoldiery() {
        return soldieryService.getAll();
    }
    @GetMapping("/speciality")
    public List<Speciality> getListSpeciality() {
        return specialityService.getAll();
    }
    @GetMapping("/subject")
    public List<Subject> getListSubject() {
        return subjectService.getAll();
    }
    @GetMapping("/targOrg")
    public List<TargOrg> getListTargOrg() {
        return targOrgService.getAll();
    }
//    @GetMapping("/unvSpeciality")
//    public List<UnvSpeciality> getListUnvSpeciality() {
//        return unvSpecialityService.getAll();
//    }
}
