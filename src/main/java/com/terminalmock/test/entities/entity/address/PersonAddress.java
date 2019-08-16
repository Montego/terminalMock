package com.terminalmock.test.entities.entity.address;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.terminalmock.test.entities.entity.PersonInfo;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@DiscriminatorValue("Person")
public class PersonAddress extends Address{
    @ManyToOne
    @JoinColumn(name = "\"RefId\"")
    @JsonBackReference
    private PersonInfo person;
}
