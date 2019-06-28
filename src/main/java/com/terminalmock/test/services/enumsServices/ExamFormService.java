package com.terminalmock.test.services.enumsServices;


import com.terminalmock.test.entities.enums.ExamForm;
import com.terminalmock.test.repositories.enumsrepo.ExamFormRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamFormService {
    private final ExamFormRepo examFormRepo;
    @Autowired
    public ExamFormService(ExamFormRepo examFormRepo) {
        this.examFormRepo = examFormRepo;
    }

    public ExamForm getOne(Long id) {
        return examFormRepo.findById(id).orElse(null);
    }

    public List<ExamForm> getAll() {
        return examFormRepo.findAll();
    }
}
