package com.terminalmock.test.services.enumsServices;


import com.terminalmock.test.entities.enums.LangInfo;
import com.terminalmock.test.repositories.enumsrepo.LangInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LangInfoService {
    private final LangInfoRepo langInfoRepo;
    @Autowired
    public LangInfoService(LangInfoRepo langInfoRepo) {
        this.langInfoRepo = langInfoRepo;
    }

    public LangInfo getOne(Long id) {
        return langInfoRepo.findById(id).orElse(null);
    }

    public List<LangInfo> getAll() {
        return langInfoRepo.findAll();
    }
}
