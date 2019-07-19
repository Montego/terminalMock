package com.terminalmock.test.entities.entity.address;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressInputElement {
    private Integer level;
    private String name;
    private String fullName;
    private String refId;

    public AddressInputElement(){}
    public AddressInputElement(Integer level, String name, String fullName, String refId){
        this.setLevel(level);
        this.setName(name);
        this.setFullName(fullName);
        this.setRefId(refId);
    }
}