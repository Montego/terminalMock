package com.terminalmock.test.entities.entity;

import com.terminalmock.test.entities.dictionary.Preference;
import com.terminalmock.test.entities.enums.AttrType;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Person_features {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "attrType")
    private AttrType tab_features_selectedAttrType;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "preference")
    private Preference tab_features_selectedPreference;
}
