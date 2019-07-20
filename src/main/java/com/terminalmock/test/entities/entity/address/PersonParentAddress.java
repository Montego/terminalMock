package com.terminalmock.test.entities.entity.address;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.terminalmock.test.entities.entity.PersonParent;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Getter
@Setter
@Entity
@DiscriminatorValue("PersonParent")
public class PersonParentAddress extends Address {
    @OneToOne
    @JoinColumn(name = "\"RefId\"")
    @JsonBackReference
    private PersonParent personParent;
}
