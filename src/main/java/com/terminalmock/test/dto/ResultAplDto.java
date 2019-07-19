package com.terminalmock.test.dto;

import com.terminalmock.test.entities.entity.ChoosenWizard;
import com.terminalmock.test.entities.view.Wizard;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResultAplDto {
    private String application_number;
    private String application_person_name;
    private LocalDate application_date = LocalDate.now();

    List<ChoosenWizard> choosenWizards;
}
