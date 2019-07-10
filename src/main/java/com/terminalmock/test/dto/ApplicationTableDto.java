package com.terminalmock.test.dto;


import com.terminalmock.test.entities.enums.DeliveryType;
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
    private Long applicationId;
    private String application_person_name;
    private String application_number;
    private LocalDate application_date;
    private DeliveryType application_selectedDeliveryType;
//    private boolean budget;
}
