package com.terminalmock.test.entities.dictionary;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "\"D_AddressState\"")
public class AddressState {
    @Id
    @Column(name = "\"CountryRegionId\"")
    private String countryRegionId;
    @Column(name = "\"StateId\"")
    private String stateId;
    @Column(name = "\"Name\"")
    private String name;
}
