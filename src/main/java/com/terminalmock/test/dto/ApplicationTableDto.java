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
public class ApplicationTableDto {
    Long id;

    private String tab_personal_name;
    private String application_number;
    private LocalDate application_date;
    private String application_selectedDeliveryType;
    private boolean budget;
}
