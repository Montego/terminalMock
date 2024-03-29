package com.terminalmock.test.controllers;

import com.terminalmock.test.dto.SubjectDao;
import com.terminalmock.test.entities.dictionary.*;
import com.terminalmock.test.services.dictionaryServices.*;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/dictionary")

public class DictionaryController {
    private final AcademyYearService academyYearService;
    private final AddressCountryRegionService addressCountryRegionService;
    private final AddressStateService addressStateService;
    private final DocumentKindService documentKindService;
    private final DocumentService documentService;
    private final EduDocService eduDocService;
    private final EduLevelService eduLevelService;
    private final FamRelationShipService famRelationShipService;
    private final HighSchoolService highSchoolService;
    private final IdentityCardCodeService identityCardCodeService;
    private final LanguageService languageService;
    private final PreferenceService preferenceService;
    private final QualificationLevelService qualificationLevelService;
    private final SoldieryService soldieryService;
    private final SpecialityService specialityService;
    private final SubjectService subjectService;
    private final TargOrgService targOrgService;

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

    @PostMapping("/preferByEduLevel/{educationLev}")
    public List<Preference> getListPreferenceByEduLevel(@PathVariable("educationLev") int educationLevel){
        return preferenceService.getAllByEduLevel(educationLevel);
    }

    @GetMapping("/academyYear")
    public Iterable<AcademyYear> getListAcademyYear() {
        return academyYearService.getAll();
    }

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
    @PostMapping("/documentByEduDoc/")
    public List<Document> findDocumentByEduDoc(@RequestBody EduDoc eduDoc) {
        List<EduDoc> eduDocs = new ArrayList<>();
        eduDocs.add(eduDoc);
        return documentService.findAllDocumentByEduDoc(eduDocs);
    }

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

    @GetMapping("/preferenceSpecial")
    public List<Preference> getPrefSpecial(){
        return preferenceService.getAllByPrefType();
    }

    @PostMapping("/preferenceOlymp")
    public List<Preference> getPreferenceByOlymp(@RequestBody SubjectDao request) throws NotFoundException {
        Optional<Subject> subjectOptional =  subjectService.findByName(request.getName());
        if (subjectOptional.isPresent()){
            List<Subject> subjects = Arrays.asList(subjectOptional.get());
            return preferenceService.getAllByOlymp(subjects);
        }

        else throw new NotFoundException("NOT CORRECT SUBJECT");
    }
}
