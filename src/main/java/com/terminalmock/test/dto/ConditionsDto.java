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

    private String deparCode = "Test deparCode";
    private String deparName = "Test deparName";
    private String dpecialityId = "Test dpecialityId";
    private String environmentId = "Test environmentId";
    private String courseNum = "Test courseNum";
    private String thisCase = "Test thisCase";
    private boolean chose = false;
}
