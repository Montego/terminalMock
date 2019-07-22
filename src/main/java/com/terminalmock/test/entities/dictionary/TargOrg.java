package com.terminalmock.test.entities.dictionary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "\"D_TargOrg\"")
public class TargOrg {
    @Id
    @Column(name = "\"TargOrgId\"")
    private String targOrgId;
    @Column(name = "\"Name\"")
    private String name;
    @Column(name = "\"AddressStateId\"")
    private String addressStateId;
    @Column(name = "\"ReportName\"")
    private String reportName;
    @Column(name = "\"CipHer\"")
    private String cipHer;
    @Column(name = "\"ShortName\"")
    private String shortName;
    @Column(name = "\"Blocked\"")
    private Integer blocked;
}
