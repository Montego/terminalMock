package com.terminalmock.test.dto;

import com.terminalmock.test.entities.enums.DocType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DocumentDto {

    private String name;
    private String serial;
    private String number;
    private String fullname;
    private DocType selected_docType;
    private LocalDate dateOfIssue;
    private int count;
    private String issuedBy;

}
