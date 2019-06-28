//package com.test.test.services.enumsServices;
//
//import com.terminal.terminalbackend.entities.enums.IsHotel;
//import com.terminal.terminalbackend.repositories.enumsrepo.IsHotelRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class IsHotelService {
//    private final IsHotelRepo isHotelRepo;
//    @Autowired
//    public IsHotelService(IsHotelRepo isHotelRepo) {
//        this.isHotelRepo = isHotelRepo;
//    }
//
//    public IsHotel getOne(Long id) {
//        return isHotelRepo.findById(id).orElse(null);
//    }
//
//    public List<IsHotel> getAll() {
//        return isHotelRepo.findAll();
//    }
//}
