package com.terminalmock.test.services.enumsServices;


import com.terminalmock.test.entities.enums.TypeDiploma;
import com.terminalmock.test.repositories.enumsrepo.TypeDiplomaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeDiplomaService {
    private final TypeDiplomaRepo typeDiplomaRepo;
    @Autowired
    public TypeDiplomaService(TypeDiplomaRepo typeDiplomaRepo) {
        this.typeDiplomaRepo = typeDiplomaRepo;
    }

    public TypeDiploma getOne(Long id) {
        return typeDiplomaRepo.findById(id).orElse(null);
    }

    public List<TypeDiploma> getAll() {
        return typeDiplomaRepo.findAll();
    }
}
