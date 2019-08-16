package com.terminalmock.test.entities.entity.address;

import com.terminalmock.test.entities.enums.AddressType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "\"EntrantFIASAddress\"")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "\"RefTable\"",discriminatorType = DiscriminatorType.STRING)

public abstract class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"EntrantFIASAddressId\"")
    private Integer entrantFIASAddressId;



    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "\"AddressType\"")
    private AddressType addressType;

    @Column(name = "\"LineNum\"")
    private Integer lineNum;

    @Column(name = "\"CountryRegionId\"")
    private String countryRegionId;
    @Column(name = "\"CountryRegionName\"")
    private String countryRegionName;

    @Column(name = "\"AOLevel1\"")
    private Integer aOLevel1;
    @Column(name = "\"AOLevel1ObjRef\"")
    private String aOLevel1ObjRef;
    @Column(name = "\"AOLevel1ObjName\"")
    private String aOLevel1ObjName;

    @Column(name = "\"AOLevel2\"")
    private Integer aOLevel2;
    @Column(name = "\"AOLevel2ObjRef\"")
    private String aOLevel2ObjRef;
    @Column(name = "\"AOLevel2ObjName\"")
    private String aOLevel2ObjName;

    @Column(name = "\"AOLevel3\"")
    private Integer aOLevel3;
    @Column(name = "\"AOLevel3ObjRef\"")
    private String aOLevel3ObjRef;
    @Column(name = "\"AOLevel3ObjName\"")
    private String aOLevel3ObjName;

    @Column(name = "\"AOLevel4\"")
    private Integer aOLevel4;
    @Column(name = "\"AOLevel4ObjRef\"")
    private String aOLevel4ObjRef;
    @Column(name = "\"AOLevel4ObjName\"")
    private String aOLevel4ObjName;

    @Column(name = "\"AOLevel5\"")
    private Integer aOLevel5;
    @Column(name = "\"AOLevel5ObjRef\"")
    private String aOLevel5ObjRef;
    @Column(name = "\"AOLevel5ObjName\"")
    private String aOLevel5ObjName;

    @Column(name = "\"AOLevel6\"")
    private Integer aOLevel6;
    @Column(name = "\"AOLevel6ObjRef\"")
    private String aOLevel6ObjRef;
    @Column(name = "\"AOLevel6ObjName\"")
    private String aOLevel6ObjName;

    @Column(name = "\"AOLevel65\"")
    private Integer aOLevel65;
    @Column(name = "\"AOLevel65ObjRef\"")
    private String aOLevel65ObjRef;
    @Column(name = "\"AOLevel65ObjName\"")
    private String aOLevel65ObjName;

    @Column(name = "\"AOLevel7\"")
    private Integer aOLevel7;
    @Column(name = "\"AOLevel7ObjRef\"")
    private String aOLevel7ObjRef;
    @Column(name = "\"AOLevel7ObjName\"")
    private String aOLevel7ObjName;

    @Column(name = "\"AOLevel90\"")
    private Integer aOLevel90;
    @Column(name = "\"AOLevel90ObjRef\"")
    private String aOLevel90ObjRef;
    @Column(name = "\"AOLevel90ObjName\"")
    private String aOLevel90ObjName;

    @Column(name = "\"AOLevel91\"")
    private Integer aOLevel91;
    @Column(name = "\"AOLevel91ObjRef\"")
    private String aOLevel91ObjRef;
    @Column(name = "\"AOLevel91ObjName\"")
    private String aOLevel91ObjName;


    @Column(name = "\"HouseRef\"")
    private String houseRef;
    @Column(name = "\"HouseNum\"")
    private String houseNum;
    @Column(name = "\"Flat\"")
    private String flat;
    @Column(name = "\"BuildNum\"")
    private String buildNum;
    @Column(name = "\"StructNum\"")
    private String structNum;
    @Column(name = "\"HouseName\"")
    private String houseName;

    @Column(name = "\"PostalCode\"")
    private String postalCode;
    @Column(name = "\"KLADRCode\"")
    private String kLADRCode;
    @Column(name = "\"AddressTxt\"")
    private String addressTxt;
    @Column(name = "\"AddressTxt_Random\"")
    private String addressTxtRandom;

    @Column(name = "\"AddressSearchText\"")
    private String addressSearchText;

    @Column(name = "\"AddressSearchId\"")
    private Integer addressSearchId;
    @Column(name = "\"ProcStatus\"")
    private Integer procStatus;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (entrantFIASAddressId != null ? !entrantFIASAddressId.equals(address.entrantFIASAddressId) : address.entrantFIASAddressId != null) return false;
        if (!addressType.equals(address.addressType)) return false;
        if (countryRegionId != null ? !countryRegionId.equals(address.countryRegionId) : address.countryRegionId != null)
            return false;
        if (countryRegionName != null ? !countryRegionName.equals(address.countryRegionName) : address.countryRegionName != null)
            return false;
        if (aOLevel1 != null ? !aOLevel1.equals(address.aOLevel1) : address.aOLevel1 != null) return false;
        if (aOLevel1ObjRef != null ? !aOLevel1ObjRef.equals(address.aOLevel1ObjRef) : address.aOLevel1ObjRef != null)
            return false;
        if (aOLevel1ObjName != null ? !aOLevel1ObjName.equals(address.aOLevel1ObjName) : address.aOLevel1ObjName != null)
            return false;
        if (aOLevel2 != null ? !aOLevel2.equals(address.aOLevel2) : address.aOLevel2 != null) return false;
        if (aOLevel2ObjRef != null ? !aOLevel2ObjRef.equals(address.aOLevel2ObjRef) : address.aOLevel2ObjRef != null)
            return false;
        if (aOLevel2ObjName != null ? !aOLevel2ObjName.equals(address.aOLevel2ObjName) : address.aOLevel2ObjName != null)
            return false;
        if (aOLevel3 != null ? !aOLevel3.equals(address.aOLevel3) : address.aOLevel3 != null) return false;
        if (aOLevel3ObjRef != null ? !aOLevel3ObjRef.equals(address.aOLevel3ObjRef) : address.aOLevel3ObjRef != null)
            return false;
        if (aOLevel3ObjName != null ? !aOLevel3ObjName.equals(address.aOLevel3ObjName) : address.aOLevel3ObjName != null)
            return false;
        if (aOLevel4 != null ? !aOLevel4.equals(address.aOLevel4) : address.aOLevel4 != null) return false;
        if (aOLevel4ObjRef != null ? !aOLevel4ObjRef.equals(address.aOLevel4ObjRef) : address.aOLevel4ObjRef != null)
            return false;
        if (aOLevel4ObjName != null ? !aOLevel4ObjName.equals(address.aOLevel4ObjName) : address.aOLevel4ObjName != null)
            return false;
        if (aOLevel5 != null ? !aOLevel5.equals(address.aOLevel5) : address.aOLevel5 != null) return false;
        if (aOLevel5ObjRef != null ? !aOLevel5ObjRef.equals(address.aOLevel5ObjRef) : address.aOLevel5ObjRef != null)
            return false;
        if (aOLevel5ObjName != null ? !aOLevel5ObjName.equals(address.aOLevel5ObjName) : address.aOLevel5ObjName != null)
            return false;
        if (aOLevel6 != null ? !aOLevel6.equals(address.aOLevel6) : address.aOLevel6 != null) return false;
        if (aOLevel6ObjRef != null ? !aOLevel6ObjRef.equals(address.aOLevel6ObjRef) : address.aOLevel6ObjRef != null)
            return false;
        if (aOLevel6ObjName != null ? !aOLevel6ObjName.equals(address.aOLevel6ObjName) : address.aOLevel6ObjName != null)
            return false;
        if (aOLevel65 != null ? !aOLevel65.equals(address.aOLevel65) : address.aOLevel65 != null) return false;
        if (aOLevel65ObjRef != null ? !aOLevel65ObjRef.equals(address.aOLevel65ObjRef) : address.aOLevel65ObjRef != null)
            return false;
        if (aOLevel65ObjName != null ? !aOLevel65ObjName.equals(address.aOLevel65ObjName) : address.aOLevel65ObjName != null)
            return false;
        if (aOLevel7 != null ? !aOLevel7.equals(address.aOLevel7) : address.aOLevel7 != null) return false;
        if (aOLevel7ObjRef != null ? !aOLevel7ObjRef.equals(address.aOLevel7ObjRef) : address.aOLevel7ObjRef != null)
            return false;
        if (aOLevel7ObjName != null ? !aOLevel7ObjName.equals(address.aOLevel7ObjName) : address.aOLevel7ObjName != null)
            return false;
        if (aOLevel90 != null ? !aOLevel90.equals(address.aOLevel90) : address.aOLevel90 != null) return false;
        if (aOLevel90ObjRef != null ? !aOLevel90ObjRef.equals(address.aOLevel90ObjRef) : address.aOLevel90ObjRef != null)
            return false;
        if (aOLevel90ObjName != null ? !aOLevel90ObjName.equals(address.aOLevel90ObjName) : address.aOLevel90ObjName != null)
            return false;
        if (aOLevel91 != null ? !aOLevel91.equals(address.aOLevel91) : address.aOLevel91 != null) return false;
        if (aOLevel91ObjRef != null ? !aOLevel91ObjRef.equals(address.aOLevel91ObjRef) : address.aOLevel91ObjRef != null)
            return false;
        if (aOLevel91ObjName != null ? !aOLevel91ObjName.equals(address.aOLevel91ObjName) : address.aOLevel91ObjName != null)
            return false;
        if (houseRef != null ? !houseRef.equals(address.houseRef) : address.houseRef != null) return false;
        if (houseName != null ? !houseName.equals(address.houseName) : address.houseName != null) return false;
        if (flat != null ? !flat.equals(address.flat) : address.flat != null) return false;
        if (addressTxt != null ? !addressTxt.equals(address.addressTxt) : address.addressTxt != null) return false;
        if (addressTxtRandom != null ? !addressTxtRandom.equals(address.addressTxtRandom) : address.addressTxtRandom != null)
            return false;
        return addressSearchText != null ? addressSearchText.equals(address.addressSearchText) : address.addressSearchText == null;

    }

    @Override
    public int hashCode() {
        int result = entrantFIASAddressId != null ? entrantFIASAddressId.hashCode() : 0;
        result = 31 * result + addressType.hashCode();
        result = 31 * result + (countryRegionId != null ? countryRegionId.hashCode() : 0);
        result = 31 * result + (countryRegionName != null ? countryRegionName.hashCode() : 0);
        result = 31 * result + (aOLevel1 != null ? aOLevel1.hashCode() : 0);
        result = 31 * result + (aOLevel1ObjRef != null ? aOLevel1ObjRef.hashCode() : 0);
        result = 31 * result + (aOLevel1ObjName != null ? aOLevel1ObjName.hashCode() : 0);
        result = 31 * result + (aOLevel2 != null ? aOLevel2.hashCode() : 0);
        result = 31 * result + (aOLevel2ObjRef != null ? aOLevel2ObjRef.hashCode() : 0);
        result = 31 * result + (aOLevel2ObjName != null ? aOLevel2ObjName.hashCode() : 0);
        result = 31 * result + (aOLevel3 != null ? aOLevel3.hashCode() : 0);
        result = 31 * result + (aOLevel3ObjRef != null ? aOLevel3ObjRef.hashCode() : 0);
        result = 31 * result + (aOLevel3ObjName != null ? aOLevel3ObjName.hashCode() : 0);
        result = 31 * result + (aOLevel4 != null ? aOLevel4.hashCode() : 0);
        result = 31 * result + (aOLevel4ObjRef != null ? aOLevel4ObjRef.hashCode() : 0);
        result = 31 * result + (aOLevel4ObjName != null ? aOLevel4ObjName.hashCode() : 0);
        result = 31 * result + (aOLevel5 != null ? aOLevel5.hashCode() : 0);
        result = 31 * result + (aOLevel5ObjRef != null ? aOLevel5ObjRef.hashCode() : 0);
        result = 31 * result + (aOLevel5ObjName != null ? aOLevel5ObjName.hashCode() : 0);
        result = 31 * result + (aOLevel6 != null ? aOLevel6.hashCode() : 0);
        result = 31 * result + (aOLevel6ObjRef != null ? aOLevel6ObjRef.hashCode() : 0);
        result = 31 * result + (aOLevel6ObjName != null ? aOLevel6ObjName.hashCode() : 0);
        result = 31 * result + (aOLevel65 != null ? aOLevel65.hashCode() : 0);
        result = 31 * result + (aOLevel65ObjRef != null ? aOLevel65ObjRef.hashCode() : 0);
        result = 31 * result + (aOLevel65ObjName != null ? aOLevel65ObjName.hashCode() : 0);
        result = 31 * result + (aOLevel7 != null ? aOLevel7.hashCode() : 0);
        result = 31 * result + (aOLevel7ObjRef != null ? aOLevel7ObjRef.hashCode() : 0);
        result = 31 * result + (aOLevel7ObjName != null ? aOLevel7ObjName.hashCode() : 0);
        result = 31 * result + (aOLevel90 != null ? aOLevel90.hashCode() : 0);
        result = 31 * result + (aOLevel90ObjRef != null ? aOLevel90ObjRef.hashCode() : 0);
        result = 31 * result + (aOLevel90ObjName != null ? aOLevel90ObjName.hashCode() : 0);
        result = 31 * result + (aOLevel91 != null ? aOLevel91.hashCode() : 0);
        result = 31 * result + (aOLevel91ObjRef != null ? aOLevel91ObjRef.hashCode() : 0);
        result = 31 * result + (aOLevel91ObjName != null ? aOLevel91ObjName.hashCode() : 0);
        result = 31 * result + (houseRef != null ? houseRef.hashCode() : 0);
        result = 31 * result + (houseName != null ? houseName.hashCode() : 0);
        result = 31 * result + (flat != null ? flat.hashCode() : 0);
        result = 31 * result + (addressTxt != null ? addressTxt.hashCode() : 0);
        result = 31 * result + (addressTxtRandom != null ? addressTxtRandom.hashCode() : 0);
        result = 31 * result + (addressSearchText != null ? addressSearchText.hashCode() : 0);
        return result;
    }
}
