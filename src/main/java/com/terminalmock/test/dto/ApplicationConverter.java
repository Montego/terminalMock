package com.terminalmock.test.dto;

import com.terminalmock.test.entities.entity.Application;
import com.terminalmock.test.entities.entity.PersonInfo;

import java.util.Set;

public class ApplicationConverter {

    public static ApplicationShortDto EntityToShortDto(Application app){

        ApplicationShortDto appSD = new ApplicationShortDto();
        appSD.setId(app.getId());

        if (app.getPerson() != null && app.getPerson().getPerson_info() != null) {
            Set<PersonInfo> personInfoSet = app.getPerson().getPerson_info();

            if (personInfoSet.size()>1) {
                throw new UnknownError("Error! #0000001"); //Person_info must had only 1 element
            } else if (personInfoSet.size() == 0){
                appSD.setPerson_full_name("");
            } else {

                PersonInfo pi = personInfoSet.iterator().next();
                appSD.setPerson_full_name(fullNamePersonInfo(pi));
            }

        }else{
            appSD.setPerson_full_name("");
        }

        appSD.setApplication_number(app.getApplication_number());
        appSD.setApplication_date(app.getApplication_date());
        appSD.setApplication_selectedDeliveryType(app.getApplication_selectedDeliveryType());

        return appSD;

    }

    public static String fullNamePersonInfo(PersonInfo pi){

        String result = "";

        if (pi.getTab_personal_lastname()!=null && !"".equals(pi.getTab_personal_lastname().trim()))
            result = pi.getTab_personal_lastname().trim();

        if (pi.getTab_personal_firstname()!=null && !"".equals(pi.getTab_personal_firstname().trim()))
            if("".equals(result))
                result = pi.getTab_personal_firstname().trim();
            else
                result = " " + pi.getTab_personal_firstname().trim();

        if (pi.getTab_personal_middlename()!=null && !"".equals(pi.getTab_personal_middlename().trim()))
            if("".equals(result))
                result = pi.getTab_personal_middlename().trim();
            else
                result = " " + pi.getTab_personal_middlename().trim();


        return result;

    }

}
