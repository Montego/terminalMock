package com.terminalmock.test.entities.enums;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "\"BE_Gender\"")
public class Gender {
    @Id
    @Column(name = "\"Id\"", nullable = false)
    private Integer id;
    @Column(name = "\"Name\"")
    private String name;

}
