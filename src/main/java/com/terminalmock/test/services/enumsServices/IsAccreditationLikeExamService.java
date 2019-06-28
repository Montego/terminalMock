//package com.test.test.services.enumsServices;
//
//import com.terminal.terminalbackend.entities.enums.IsAccreditationLikeExam;
//import com.terminal.terminalbackend.repositories.enumsrepo.IsAccreditationLikeExamRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class IsAccreditationLikeExamService {
//    private final IsAccreditationLikeExamRepo isAccreditationLikeExamRepo;
//    @Autowired
//    public IsAccreditationLikeExamService(IsAccreditationLikeExamRepo isAccreditationLikeExamRepo) {
//        this.isAccreditationLikeExamRepo = isAccreditationLikeExamRepo;
//    }
//
//    public IsAccreditationLikeExam getOne(Long id) {
//        return isAccreditationLikeExamRepo.findById(id).orElse(null);
//    }
//
//    public List<IsAccreditationLikeExam> getAll() {
//        return isAccreditationLikeExamRepo.findAll();
//    }
//}
