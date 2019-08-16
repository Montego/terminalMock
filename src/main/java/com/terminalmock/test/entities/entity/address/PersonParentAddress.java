package com.terminalmock.test.entities.entity.address;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.terminalmock.test.entities.entity.PersonParent;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@DiscriminatorValue("PersonParent")
public class PersonParentAddress extends Address {
    @OneToOne(optional = false)
    @JoinColumn(name = "\"RefId\"", nullable = false)
    @JsonBackReference
    private PersonParent personParent;
}
