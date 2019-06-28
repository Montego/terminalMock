//package com.test.test.services.enumsServices;
//
//import com.terminal.terminalbackend.entities.enums.EduCrimea;
//import com.terminal.terminalbackend.repositories.enumsrepo.EduCrimeaRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class EduCrimeaService {
//    private final EduCrimeaRepo eduCrimeaRepo;
//    @Autowired
//    public EduCrimeaService(EduCrimeaRepo eduCrimeaRepo) {
//        this.eduCrimeaRepo = eduCrimeaRepo;
//    }
//
//    public EduCrimea getOne(Long id) {
//        return eduCrimeaRepo.findById(id).orElse(null);
//    }
//
//    public List<EduCrimea> getAll() {
//        return eduCrimeaRepo.findAll();
//    }
//}
