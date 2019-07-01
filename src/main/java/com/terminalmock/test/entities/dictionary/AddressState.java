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

    @Column(name = "\"CountryRegionId\"")
    private String countryRegionId;
    @Id
    @Column(name = "\"StateId\"")
    private String stateId;
    @Column(name = "\"Name\"")
    private String name;
}
