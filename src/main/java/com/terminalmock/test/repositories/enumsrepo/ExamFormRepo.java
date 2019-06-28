package com.terminalmock.test.repositories.enumsrepo;

import com.terminalmock.test.entities.enums.ExamForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamFormRepo extends JpaRepository<ExamForm, Long> {
}
