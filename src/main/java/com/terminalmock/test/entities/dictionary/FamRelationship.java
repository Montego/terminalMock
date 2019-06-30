package com.terminalmock.test.entities.dictionary;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "\"D_FamRelationShip\"")
public class FamRelationship {

//    private Long id;
    @Id
    @Column(name = "\"FamRelationShipId\"")
    private String famRelationShipId;
    @Column(name = "\"Name\"")
    private String name;

}
