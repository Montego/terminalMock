package com.terminalmock.test.entities.enums;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "\"BE_AddressType\"")
@EqualsAndHashCode
public class AddressType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"Id\"")
    private Integer id;
    @Column(name = "\"Name\"")
    private String name;
}