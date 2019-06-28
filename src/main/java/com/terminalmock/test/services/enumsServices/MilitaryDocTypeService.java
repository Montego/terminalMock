//package com.test.test.services.enumsServices;
//
//import com.terminal.terminalbackend.entities.enums.MilitaryDocType;
//import com.terminal.terminalbackend.repositories.enumsrepo.MilitaryDocTypeRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class MilitaryDocTypeService {
//    private final MilitaryDocTypeRepo militaryDocTypeRepo;
//    @Autowired
//    public MilitaryDocTypeService(MilitaryDocTypeRepo militaryDocTypeRepo) {
//        this.militaryDocTypeRepo = militaryDocTypeRepo;
//    }
//
//    public MilitaryDocType getOne(Long id) {
//        return militaryDocTypeRepo.findById(id).orElse(null);
//    }
//
//    public List<MilitaryDocType> getAll() {
//        return militaryDocTypeRepo.findAll();
//    }
//}
