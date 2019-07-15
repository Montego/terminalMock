package com.terminalmock.test.services.dtoServices;

import com.terminalmock.test.dto.DocumentDto;
import com.terminalmock.test.entities.entity.PersonInfo;
import com.terminalmock.test.repositories.entityrepo.PersonInfoRepo;
import com.terminalmock.test.services.enumsServices.DocTypeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FillDocumentsDtoService {
    private final PersonInfoRepo personInfoRepo;
    private final DocTypeService docTypeService;
    public FillDocumentsDtoService(PersonInfoRepo personInfoRepo, DocTypeService docTypeService) {
        this.personInfoRepo = personInfoRepo;

        this.docTypeService = docTypeService;
    }

    public List<DocumentDto> getFillDocumentsByPersonInfo(long id){
//        DocType docType = new DocType();

        PersonInfo personInfo = personInfoRepo.findById(id).orElse(null);
        DocumentDto doc1 = new DocumentDto();

        doc1.setName(personInfo.getTab_personal_selectedIdentityCardCode().getIdentityCardNameFull());
        doc1.setSerial(personInfo.getTab_personal_identityCardSeries());
        doc1.setNumber(personInfo.getTab_personal_identityCardNumber());
        doc1.setFullname(
                personInfo.getTab_personal_selectedIdentityCardCode().getIdentityCardNameFull() +
                " " +
                personInfo.getTab_personal_identityCardSeries() +
                " " +
                personInfo.getTab_personal_identityCardNumber());
        doc1.setSelected_docType(docTypeService.getOne(1));
        doc1.setDateOfIssue(personInfo.getTab_personal_identityCardIssueDate());
        doc1.setCount(1);
        doc1.setIssuedBy(personInfo.getTab_personal_identityCardIssueBy());

        DocumentDto doc2 = new DocumentDto();
        doc2.setName(personInfo.getTab_edu_military_selectedEduDoc().getName());
        doc2.setSerial(personInfo.getTab_edu_military_eduDocSerial());
        doc2.setNumber(personInfo.getTab_edu_military_eduDocNumber());
        doc2.setFullname(
                personInfo.getTab_edu_military_selectedEduDoc().getName() +
                        " " +
                        personInfo.getTab_edu_military_eduDocSerial() +
                        " " +
                        personInfo.getTab_edu_military_eduDocNumber());
        doc2.setSelected_docType(docTypeService.getOne(1));
        doc2.setDateOfIssue(personInfo.getTab_edu_military_eduDocDate());
        doc2.setCount(2);
        doc2.setIssuedBy(personInfo.getTab_edu_military_eduDocName());

        List<DocumentDto> documentDtos = new ArrayList<>();
        documentDtos.add(doc1);
        documentDtos.add(doc2);

        DocumentDto doc3 = new DocumentDto();
        if(personInfo.getTab_edu_military_selectedMilitaryFormDoc() != null){
            doc3.setName(personInfo.getTab_edu_military_selectedMilitaryFormDoc().getName());
            doc3.setSerial(personInfo.getTab_edu_military_militarySeries());
            doc3.setNumber(personInfo.getTab_edu_military_militaryNumber());
            doc3.setFullname(
                    personInfo.getTab_edu_military_selectedMilitaryFormDoc().getName() +
                            " " +
                            personInfo.getTab_edu_military_militarySeries() +
                            " " +
                            personInfo.getTab_edu_military_militaryNumber());
            doc3.setSelected_docType(personInfo.getTab_edu_military_selectedDocType());
            doc3.setDateOfIssue(personInfo.getTab_edu_military_militaryIssueDate());
            doc3.setCount(2);
            doc3.setIssuedBy(personInfo.getTab_edu_military_militaryIssueBy());
            documentDtos.add(doc3);
        }else{
            System.out.println("aaaaaaa");
        }

        return documentDtos;
    }

}
