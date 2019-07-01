package com.terminalmock.test.entities.enums;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "\"BE_MilitaryFormDoc\"")
public class MilitaryFormDoc {
    @Id
    @Column(name = "\"Id\"")
    private int id;
    @Column(name = "\"Name\"")
    private String name;
}
