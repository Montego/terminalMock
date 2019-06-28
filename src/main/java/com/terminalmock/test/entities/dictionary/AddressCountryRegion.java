package com.terminalmock.test.entities.dictionary;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "D_AddressCountryRegion")
public class AddressCountryRegion {
    @Id
    private String countryRegionId;

    private String name;
}
