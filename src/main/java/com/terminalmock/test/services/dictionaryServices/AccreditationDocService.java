//package com.test.test.services.dictionaryServices;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class AccreditationDocService {
//    private final AccreditationDocRepo accreditationDocRepo;
//    @Autowired
//    public AccreditationDocService(AccreditationDocRepo accreditationDocRepo) {
//        this.accreditationDocRepo = accreditationDocRepo;
//    }
//
//    public AccreditationDoc getOne(Long id) {
//        return accreditationDocRepo.findById(id).orElse(null);
//    }
//
//    public List<AccreditationDoc> getAll() {
//        return accreditationDocRepo.findAll();
//    }
//}
