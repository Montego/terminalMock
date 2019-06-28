//package com.test.test.services.enumsServices;
//
//
//import com.test.test.entities.enums.AccreditationDocType;
//import com.test.test.repositories.enumsrepo.AccreditationDocTypeRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class AccreditationDocTypeService {
//    private final AccreditationDocTypeRepo accreditationDocTypeRepo;
//    @Autowired
//    public AccreditationDocTypeService(AccreditationDocTypeRepo accreditationDocTypeRepo) {
//        this.accreditationDocTypeRepo = accreditationDocTypeRepo;
//    }
//
//    public AccreditationDocType getOne(Long id) {
//        return accreditationDocTypeRepo.findById(id).orElse(null);
//    }
//
//    public List<AccreditationDocType> getAll() {
//        return accreditationDocTypeRepo.findAll();
//    }
//}
