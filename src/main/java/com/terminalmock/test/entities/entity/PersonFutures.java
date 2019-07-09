package com.terminalmock.test.entities.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.terminalmock.test.entities.dictionary.Preference;
import com.terminalmock.test.entities.enums.AttrType;
import com.terminalmock.test.entities.enums.DocType;
import com.terminalmock.test.entities.enums.TypeDiploma;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class PersonFutures {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "attrType")
    private AttrType tab_features_selectedAttrType;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "preference")
    private Preference tab_features_selectedPreference;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "typeDiploma")
    private TypeDiploma tab_features_selectedTypeDiploma;
    private String tab_features_serial;
    private String tab_features_number;
    private String doc1;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "DocType1")
    private DocType tab_features_selectedDocType1 = null;
    private String doc2;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "DocType2")
    private DocType tab_features_selectedDocType2 = null;
    private String doc3;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "DocType3")
    private DocType tab_features_selectedDocType3 = null;

    @JoinColumn(name="person_futureInfo_id")
    @ManyToOne(fetch = FetchType.EAGER)
    @JsonBackReference
    Person person;

    //конструктор для информативного заполения JSON
    public PersonFutures(boolean defValues) {

        if (defValues) {
            this.id                                     = (long) -1;
            this.tab_features_selectedAttrType          = new AttrType();
            this.tab_features_selectedPreference        = new Preference();
            this.tab_features_selectedTypeDiploma       = new TypeDiploma();
            this.tab_features_serial                    = "";
            this.tab_features_number                    = "";
            this.doc1                                   = "";
            this.tab_features_selectedDocType1          = new DocType();
            this.doc2                                   = "";
            this.tab_features_selectedDocType2          = new DocType();
            this.doc3                                   = "";
            this.tab_features_selectedDocType3          = new DocType();
            this.person                                 = new Person();
        }
    }


}
