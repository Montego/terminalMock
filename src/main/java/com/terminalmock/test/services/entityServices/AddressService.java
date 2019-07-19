package com.terminalmock.test.services.entityServices;

import com.terminalmock.test.entities.entity.address.AddressCell;
import com.terminalmock.test.entities.entity.address.Address;
import com.terminalmock.test.entities.entity.address.AddressCellBasedDto;
import com.terminalmock.test.entities.entity.address.AddressInputElement;
import com.terminalmock.test.entities.entity.address.PersonAddress;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressService {

    public List<AddressInputElement> getDataForAddressInputs(String searchString, String refId, Integer level){
        return new ArrayList<>();
    }

    private String getRefId(){
        return new String();
    }

    public PersonAddress getFillAddress(){
        return new PersonAddress();
    }

    public void fillAddressTxt(){

    }

    public static AddressCellBasedDto convertAdrToAdrDto(PersonAddress model){
        AddressCellBasedDto dto =  new AddressCellBasedDto();

        dto.setAddressId(model.getEntrantFIASAddressId());
        dto.setAddressType(model.getAddressType() != null ? model.getAddressType() : null);

        dto.setCountryRegion(new AddressCell(0,model.getCountryRegionId(), model.getCountryRegionName()));
        dto.setAOLevel1(new AddressCell(1, model.getAOLevel1ObjRef(), model.getAOLevel1ObjName()));
        dto.setAOLevel2(new AddressCell(2, model.getAOLevel2ObjRef(), model.getAOLevel2ObjName()));
        dto.setAOLevel3(new AddressCell(3, model.getAOLevel3ObjRef(), model.getAOLevel3ObjName()));
        dto.setAOLevel4(new AddressCell(4, model.getAOLevel4ObjRef(), model.getAOLevel4ObjName()));
        dto.setAOLevel5(new AddressCell(5, model.getAOLevel5ObjRef(), model.getAOLevel5ObjName()));
        dto.setAOLevel6(new AddressCell(6, model.getAOLevel6ObjRef(), model.getAOLevel6ObjName()));
        dto.setAOLevel65(new AddressCell(65, model.getAOLevel65ObjRef(), model.getAOLevel65ObjName()));
        dto.setAOLevel7(new AddressCell(7, model.getAOLevel7ObjRef(), model.getAOLevel7ObjName()));
        dto.setAOLevel90(new AddressCell(90, model.getAOLevel90ObjRef(), model.getAOLevel90ObjName()));
        dto.setAOLevel91(new AddressCell(91, model.getAOLevel91ObjRef(), model.getAOLevel91ObjName()));
        dto.setHouse(new AddressCell(100, model.getHouseRef(), model.getHouseName()));

        dto.setFlat(model.getFlat());
        dto.setPostalCode(model.getPostalCode());
        dto.setAddressTxt(model.getAddressTxt());
        dto.setAddressTxtRandom(model.getAddressTxtRandom());
        dto.setAddressSearchText(model.getAddressSearchText());
        return dto;
    }


    public static void convertAdrDtoToAdr(AddressCellBasedDto cellDto, Address dto){
        if ((cellDto != null) && (dto != null)){

            dto.setEntrantFIASAddressId(cellDto.getAddressId());

            dto.setAddressType(cellDto.getAddressType());

            dto.setCountryRegionId(cellDto.getCountryRegion() != null ? cellDto.getCountryRegion().getRefId() : null);
            dto.setCountryRegionName(cellDto.getCountryRegion() != null ? cellDto.getCountryRegion().getName() : null);

            dto.setAOLevel1( isEmptyCell(cellDto.getAOLevel1()) ? null : cellDto.getAOLevel1().getLevel() );
            dto.setAOLevel1ObjRef( isEmptyCell(cellDto.getAOLevel1()) ? null : cellDto.getAOLevel1().getRefId());
            dto.setAOLevel1ObjName(isEmptyCell(cellDto.getAOLevel1()) ? null : cellDto.getAOLevel1().getName());

            dto.setAOLevel2( isEmptyCell(cellDto.getAOLevel2()) ? null : cellDto.getAOLevel2().getLevel());
            dto.setAOLevel2ObjRef( isEmptyCell(cellDto.getAOLevel2()) ? null : cellDto.getAOLevel2().getRefId() );
            dto.setAOLevel2ObjName( isEmptyCell(cellDto.getAOLevel2()) ? null : cellDto.getAOLevel2().getName());

            dto.setAOLevel3( isEmptyCell(cellDto.getAOLevel3()) ? null : cellDto.getAOLevel3().getLevel() );
            dto.setAOLevel3ObjRef( isEmptyCell(cellDto.getAOLevel3()) ? null : cellDto.getAOLevel3().getRefId());
            dto.setAOLevel3ObjName( isEmptyCell(cellDto.getAOLevel3()) ? null : cellDto.getAOLevel3().getName());

            dto.setAOLevel4( isEmptyCell(cellDto.getAOLevel4()) ? null : cellDto.getAOLevel4().getLevel());
            dto.setAOLevel4ObjRef( isEmptyCell(cellDto.getAOLevel4()) ? null : cellDto.getAOLevel4().getRefId());
            dto.setAOLevel4ObjName( isEmptyCell(cellDto.getAOLevel4()) ? null : cellDto.getAOLevel4().getName());

            dto.setAOLevel5( isEmptyCell(cellDto.getAOLevel5()) ? null : cellDto.getAOLevel5().getLevel() );
            dto.setAOLevel5ObjRef( isEmptyCell(cellDto.getAOLevel5()) ? null : cellDto.getAOLevel5().getRefId() );
            dto.setAOLevel5ObjName( isEmptyCell(cellDto.getAOLevel5()) ? null : cellDto.getAOLevel5().getName());

            dto.setAOLevel6( isEmptyCell(cellDto.getAOLevel6()) ? null : cellDto.getAOLevel6().getLevel());
            dto.setAOLevel6ObjRef( isEmptyCell(cellDto.getAOLevel6()) ? null : cellDto.getAOLevel6().getRefId());
            dto.setAOLevel6ObjName( isEmptyCell(cellDto.getAOLevel6()) ? null : cellDto.getAOLevel6().getName());

            dto.setAOLevel65( isEmptyCell(cellDto.getAOLevel65()) ? null : cellDto.getAOLevel65().getLevel());
            dto.setAOLevel65ObjRef( isEmptyCell(cellDto.getAOLevel65()) ? null : cellDto.getAOLevel65().getRefId());
            dto.setAOLevel65ObjName( isEmptyCell(cellDto.getAOLevel65()) ? null : cellDto.getAOLevel65().getName());

            dto.setAOLevel7( isEmptyCell(cellDto.getAOLevel7()) ? null : cellDto.getAOLevel7().getLevel());
            dto.setAOLevel7ObjRef( isEmptyCell(cellDto.getAOLevel7()) ? null : cellDto.getAOLevel7().getRefId() );
            dto.setAOLevel7ObjName( isEmptyCell(cellDto.getAOLevel7()) ? null : cellDto.getAOLevel7().getName());

            dto.setAOLevel90( isEmptyCell(cellDto.getAOLevel90()) ? null : cellDto.getAOLevel90().getLevel());
            dto.setAOLevel90ObjRef(  isEmptyCell(cellDto.getAOLevel90()) ? null : cellDto.getAOLevel90().getRefId());
            dto.setAOLevel90ObjName( isEmptyCell(cellDto.getAOLevel90()) ? null : cellDto.getAOLevel90().getName());

            dto.setAOLevel91( isEmptyCell(cellDto.getAOLevel91()) ? null : cellDto.getAOLevel91().getLevel());
            dto.setAOLevel91ObjRef( isEmptyCell(cellDto.getAOLevel91()) ? null : cellDto.getAOLevel91().getRefId());
            dto.setAOLevel91ObjName(isEmptyCell(cellDto.getAOLevel91()) ? null : cellDto.getAOLevel91().getName());

            dto.setHouseRef( isEmptyCell(cellDto.getHouse()) ? null : cellDto.getHouse().getRefId());
            dto.setHouseName( isEmptyCell(cellDto.getHouse()) ? null : cellDto.getHouse().getName());

            dto.setFlat(cellDto.getFlat());
            dto.setPostalCode(cellDto.getPostalCode());

            dto.setAddressTxt(cellDto.getAddressTxt());
            dto.setAddressTxtRandom(cellDto.getAddressTxtRandom());}


    }



    private static Boolean isEmptyCell(AddressCell cell) {
        return cell.getLevel() == null || cell.getRefId() == null || "".equals(cell.getRefId());
    }
}
