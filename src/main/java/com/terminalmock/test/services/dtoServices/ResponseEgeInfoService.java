//package com.terminalmock.test.services.dtoServices;
//
//import com.terminalmock.test.dto.ResponseEgeInfo;
//import com.terminalmock.test.repositories.dtorepo.ResponseEgeInfoRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class ResponseEgeInfoService {
//    private final ResponseEgeInfoRepo responseEgeInfoRepo;
//    @Autowired
//    public ResponseEgeInfoService(ResponseEgeInfoRepo responseEgeInfoRepo) {
//        this.responseEgeInfoRepo = responseEgeInfoRepo;
//    }
//
//    public List<ResponseEgeInfo> findAllByPerson_ege_id(Long id) {
//        return responseEgeInfoRepo.findAllByPerson_ege_id(id);
//    }
//}
