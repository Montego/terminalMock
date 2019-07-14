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
public class PersonTableDto {
    Long id;

    private String tab_personal_lastname;
    private String tab_personal_firstname;
    private String tab_personal_middlename;
    private LocalDate tab_personal_birthDate;

//    private String application_number;
    private String resultAcceptPerson;
}
