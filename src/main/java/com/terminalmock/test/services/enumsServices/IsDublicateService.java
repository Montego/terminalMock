//package com.test.test.services.enumsServices;
//
//import com.terminal.terminalbackend.entities.enums.IsDublicate;
//import com.terminal.terminalbackend.repositories.enumsrepo.IsDublicateRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class IsDublicateService {
//    private final IsDublicateRepo isDublicateRepo;
//    @Autowired
//    public IsDublicateService(IsDublicateRepo isDublicateRepo) {
//        this.isDublicateRepo = isDublicateRepo;
//    }
//
//    public IsDublicate getOne(Long id) {
//        return isDublicateRepo.findById(id).orElse(null);
//    }
//
//    public List<IsDublicate> getAll() {
//        return isDublicateRepo.findAll();
//    }
//}
