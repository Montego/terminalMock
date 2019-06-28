//package com.test.test.services.dictionaryServices;
//
//import com.terminal.terminalbackend.entities.dictionary.OtherCountryRegion;
//import com.terminal.terminalbackend.repositories.dictionaryrepo.OtherCountryRegionRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class OtherCountryRegionService {
//    private final OtherCountryRegionRepo otherCountryRegionRepo;
//    @Autowired
//    public OtherCountryRegionService(OtherCountryRegionRepo otherCountryRegionRepo) {
//        this.otherCountryRegionRepo = otherCountryRegionRepo;
//    }
//
//    public OtherCountryRegion getOne(Long id) {
//        return otherCountryRegionRepo.findById(id).orElse(null);
//    }
//
//    public List<OtherCountryRegion> getAll() {
//        return otherCountryRegionRepo.findAll();
//    }
//}
