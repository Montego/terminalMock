package com.terminalmock.test.entities.dictionary;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

//@Entity
//@Data
//@Table(name = "\"D_FISSettlementTypeId\"")
public class FISSettlementType {

    @Id
    @Column(name = "\"settlementTypeId\"")
    private String settlementTypeId;

    @Column(name = "\"description\"")
    private String description;


}
