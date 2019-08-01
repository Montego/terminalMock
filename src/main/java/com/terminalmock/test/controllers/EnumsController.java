package com.terminalmock.test.controllers;

import com.terminalmock.test.entities.enums.*;
import com.terminalmock.test.services.enumsServices.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/enums")
public class EnumsController {

    private final AttrTypeService attrTypeService;
    private final DeliveryTypeService deliveryTypeService;
    private final DocTypeService docTypeService;
    private final EducationLevelService educationLevelService;
    private final ExamFormService examFormService;
    private final GenderService genderService;
    private final LangInfoService langInfoService;
    private final LanguageLevelService languageLevelService;
    private final MilitaryFormDocService militaryFormDocService;
    private final PrefTypeService prefTypeService;
    private final SoldieryStatusService soldieryStatusService;
    private final TypeDiplomaService typeDiplomaService;

    @Autowired
    public EnumsController(AttrTypeService attrTypeService, DeliveryTypeService deliveryTypeService,
                           DocTypeService docTypeService, EducationLevelService educationLevelService,
                           ExamFormService examFormService, GenderService genderService,
                           LangInfoService langInfoService, LanguageLevelService languageLevelService,
                           MilitaryFormDocService militaryFormDocService, PrefTypeService prefTypeService, SoldieryStatusService soldieryStatusService, TypeDiplomaService typeDiplomaService) {
        this.attrTypeService = attrTypeService;

        this.deliveryTypeService = deliveryTypeService;
        this.docTypeService = docTypeService;
        this.educationLevelService = educationLevelService;

        this.examFormService = examFormService;
        this.genderService = genderService;

        this.langInfoService = langInfoService;
        this.languageLevelService = languageLevelService;

        this.militaryFormDocService = militaryFormDocService;
        this.prefTypeService = prefTypeService;
        this.soldieryStatusService = soldieryStatusService;
        this.typeDiplomaService = typeDiplomaService;
    }


    @GetMapping("/attrType")
    public List<AttrType> getListAttrType() {
        return attrTypeService.getAll();
    }

    @GetMapping("/attrType/{id}")
    public AttrType getOneAttrType(@PathVariable Integer id) {
        return attrTypeService.getOne(id);
    }

    @GetMapping("/deliveryType")
    public List<DeliveryType> getListDeliveryType() {
        return deliveryTypeService.getAll();
    }

    @GetMapping("/docType")
    public List<DocType> getListDocType() {
        return docTypeService.getAll();
    }

    @GetMapping("/educationLevel")
    public List<EducationLevel> getListEducationLevel() {
        return educationLevelService.getAll();
    }

    @GetMapping("/examForm")
    public List<ExamForm> getListExamForm() {
        return examFormService.getAll();
    }

    @GetMapping("/gender")
    public List<Gender> getListGender() {
        return genderService.getAll();
    }

    @GetMapping("/langInfo")
    public List<LangInfo> getListLangInfo() {
        return langInfoService.getAll();
    }

    @GetMapping("/languageLevel")
    public List<LanguageLevel> getListLanguageLevel() {
        return languageLevelService.getAll();
    }


    @GetMapping("/militaryFormDoc")
    public List<MilitaryFormDoc> getListMilitaryFormDoc() {
        return militaryFormDocService.getAll();
    }

    @GetMapping("/prefType")
    public List<PrefType> getListPrefType() {
        return prefTypeService.getAll();
    }

    @GetMapping("/soldieryStatus")
    public List<SoldieryStatus> getListSoldieryStatus() {
        return soldieryStatusService.getAll();
    }

    @GetMapping("/typeDiploma")
    public List<TypeDiploma> getListTypeDiploma() {
        return typeDiplomaService.getAll();
    }


}

