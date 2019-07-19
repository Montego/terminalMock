package com.terminalmock.test.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ConditionsDto {

    private String deparCode;
    private String deparName;
    private String dpecialityId;
    private String environmentId;
    private String courseNum;
    private String eduForm;
    private boolean chose;
//    private String application_number;
//    private String application_person_name;
//    private LocalDate application_date = LocalDate.now();
}
