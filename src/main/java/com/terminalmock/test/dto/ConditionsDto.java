package com.terminalmock.test.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

}
