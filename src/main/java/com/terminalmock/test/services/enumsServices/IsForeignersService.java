//package com.test.test.services.enumsServices;
//
//import com.terminal.terminalbackend.entities.enums.IsForeigners;
//import com.terminal.terminalbackend.repositories.enumsrepo.IsForeignersRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class IsForeignersService {
//    private final IsForeignersRepo isForeignersRepo;
//    @Autowired
//    public IsForeignersService(IsForeignersRepo isForeignersRepo) {
//        this.isForeignersRepo = isForeignersRepo;
//    }
//
//    public IsForeigners getOne(Long id) {
//        return isForeignersRepo.findById(id).orElse(null);
//    }
//
//    public List<IsForeigners> getAll() {
//        return isForeignersRepo.findAll();
//    }
//}
