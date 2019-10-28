package com.terminalmock.test.entities.dictionary;

import com.terminalmock.test.entities.enums.EduCountryType;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "\"D_AddressCountryRegion\"" )
public class AddressCountryRegion {
    @Id
    @Column(name = "\"CountryRegionId\"" )
    private String countryRegionId;
    @Column(name = "\"Name\"")
    private String name;

//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "\"EduCountryType\"")
    @Column(name = "\"EduCountryType\"" )
    private String eduCountryType;
//    private EduCountryType eduCountryType;
}
