//package com.test.test.services.dictionaryServices;
//
//import com.terminal.terminalbackend.entities.dictionary.UnvSpeciality;
//import com.terminal.terminalbackend.repositories.dictionaryrepo.UnvSpecialityRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class UnvSpecialityService {
//
//    private final UnvSpecialityRepo unvSpecialityRepo;
//    @Autowired
//    public UnvSpecialityService(UnvSpecialityRepo unvSpecialityRepo) {
//        this.unvSpecialityRepo = unvSpecialityRepo;
//    }
//
//    public UnvSpeciality getOne(Long id) {
//        return unvSpecialityRepo.findById(id).orElse(null);
//    }
//
//    public List<UnvSpeciality> getAll() {
//        return unvSpecialityRepo.findAll();
//    }
//}
