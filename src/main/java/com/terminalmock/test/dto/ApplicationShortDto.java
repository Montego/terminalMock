package com.terminalmock.test.dto;

import com.terminalmock.test.entities.entity.ApplicationCondition;
import com.terminalmock.test.entities.entity.ApplicationDocuments;
import com.terminalmock.test.entities.enums.DeliveryType;
import com.terminalmock.test.entities.enums.DocType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApplicationShortDto {

    private Long            id;
    private String          person_full_name;
    private String          application_number;
    private LocalDate       application_date;
    private DeliveryType    application_selectedDeliveryType;

}
