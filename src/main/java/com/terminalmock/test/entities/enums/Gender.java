package com.terminalmock.test.entities.enums;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name ="\"BE_Gender\"" )
public class Gender {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "\"Id\"", nullable = false)
    private Integer id;
    @Column(name = "\"Name\"")
    private String name;


}
