package com.terminalmock.test.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PersonDto {
    Long id;

    private String tab_personal_lastname;
    private String tab_personal_firstname;
    private String tab_personal_middlename;

}
