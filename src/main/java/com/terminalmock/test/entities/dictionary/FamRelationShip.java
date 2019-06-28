package com.terminalmock.test.entities.dictionary;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "D_FamRelationShip")
public class FamRelationShip {

//    private Long id;
    @Id
    private String famRelationShipId;

    private String name;

}
