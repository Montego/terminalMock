package com.terminalmock.test.entities.enums;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "BE_IsForeigners")
public class IsForeigners {
    @Id
    private Long id;
    private String name;
}
