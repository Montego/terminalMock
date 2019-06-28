//package com.test.test.services.dictionaryServices;
//
//import com.terminal.terminalbackend.entities.dictionary.EduCountryRegion;
//import com.terminal.terminalbackend.repositories.dictionaryrepo.EduCountryRegionRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class EduCountryRegionService {
//    private final EduCountryRegionRepo eduCountryRegionRepo;
//    @Autowired
//    public EduCountryRegionService(EduCountryRegionRepo eduCountryRegionRepo) {
//        this.eduCountryRegionRepo = eduCountryRegionRepo;
//    }
//
//    public EduCountryRegion getOne(Long id) {
//        return eduCountryRegionRepo.findById(id).orElse(null);
//    }
//
//    public List<EduCountryRegion> getAll() {
//        return eduCountryRegionRepo.findAll();
//    }
//}
