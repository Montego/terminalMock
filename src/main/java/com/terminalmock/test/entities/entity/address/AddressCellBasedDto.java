package com.terminalmock.test.entities.entity.address;


import com.terminalmock.test.entities.enums.AddressType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class AddressCellBasedDto {
    private Integer addressId;
    private AddressType addressType;
    private String refTable;

    private AddressCell countryRegion;
    private AddressCell aOLevel1;
    private AddressCell aOLevel2;
    private AddressCell aOLevel3;
    private AddressCell aOLevel4;
    private AddressCell aOLevel5;
    private AddressCell aOLevel6;
    private AddressCell aOLevel65;
    private AddressCell aOLevel7;
    private AddressCell aOLevel90;
    private AddressCell aOLevel91;
    private AddressCell house;

    private String flat;
    private String postalCode;
    private String addressTxt;
    private String addressTxtRandom;
    private String addressSearchText;

    private AddressCell addressSearchObj;

    public AddressCellBasedDto(Boolean defaultValues){
        if (defaultValues){
            this.countryRegion = new AddressCell();
            this.aOLevel1 = new AddressCell();
            this.aOLevel2 = new AddressCell();
            this.aOLevel3 = new AddressCell();
            this.aOLevel4 = new AddressCell();
            this.aOLevel5 = new AddressCell();
            this.aOLevel6 = new AddressCell();
            this.aOLevel65 = new AddressCell();
            this.aOLevel7 = new AddressCell();
            this.aOLevel90 = new AddressCell();
            this.aOLevel91 = new AddressCell();
            this.house = new AddressCell();
        }
    }
}
