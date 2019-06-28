package com.terminalmock.test.entities.dictionary;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "\"D_AddressCountryRegion\"" )
public class AddressCountryRegion {
    @Id
    @Column(name = "\"CountryRegionId\"")
    private String countryRegionId;
    @Column(name = "\"Name\"")
    private String name;
}
