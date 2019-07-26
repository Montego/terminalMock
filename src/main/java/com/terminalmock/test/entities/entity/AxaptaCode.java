package com.terminalmock.test.entities.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AxaptaCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String agreementId;
    private String applicationId;
    private String contactPersonId;


    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="person_id")
    @JsonBackReference
    Person person_axapta;
}
