package com.terminalmock.test.entities.dictionary;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "D_AddressState")
public class AddressState {
    @Id
    private String countryRegionId;

    private String stateId;

    private String name;
}
