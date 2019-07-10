package com.terminalmock.test.model.comparison;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

/* Operations:
1 - equal
2 - like
3 - between
4 - greater than
5 - less than
6 - start with
7 - in the list
*/

@NoArgsConstructor
@Setter
@Getter
public class SearchParams {

    //region  Входные параметры отбора

    //свойства основого сертификата

    private SearchSelect tab_personal_lastname;
    private SearchSelect tab_personal_firstname;
    private SearchSelect tab_personal_middlename;

    private String sortProperty;
    private String sortDirection;
    private Integer size;
    private Integer page;

    //endregion

    public ArrayList<SearchElement> toArrayList() {

        ArrayList<SearchElement> resultArray = new ArrayList<>();

        if (this.tab_personal_lastname != null && this.tab_personal_lastname.select != null && tab_personal_lastname.input != null) {
            addNewSearchElement(resultArray,
                    "tab_personal_lastname",
                    tab_personal_lastname.input,
                    "",
                    null,
                    getNumberOfOperation(this.tab_personal_lastname.select),
                    "");
        }

        if (this.tab_personal_firstname != null && this.tab_personal_firstname.select != null && tab_personal_firstname.input != null) {
            addNewSearchElement(resultArray,
                    "tab_personal_firstname",
                    tab_personal_firstname.input,
                    "",
                    null,
                    getNumberOfOperation(this.tab_personal_firstname.select),
                    "");
        }

        if (this.tab_personal_middlename != null && this.tab_personal_middlename.select != null && tab_personal_middlename.input != null) {
            addNewSearchElement(resultArray,
                    "tab_personal_middlename",
                    tab_personal_middlename.input,
                    "",
                    null,
                    getNumberOfOperation(this.tab_personal_middlename.select),
                    "");
        }

        return resultArray;
    }

    private void addNewSearchElement(ArrayList<SearchElement> resultArray,
                                     String propertyName,
                                     Comparable comparisonValue1,
                                     Comparable comparisonValue2,
                                     ArrayList<Object> listOfValues,
                                     Integer operation,
                                     String parentPropertyName) {

        SearchElement curSearchElement = new SearchElement();

        curSearchElement.setPropertyName(propertyName);
        curSearchElement.setComparisonValue1(comparisonValue1);
        curSearchElement.setComparisonValue2(comparisonValue2);
        curSearchElement.setListOfValues(listOfValues);

        curSearchElement.setOperation(operation);
        curSearchElement.setParentPropertyName(parentPropertyName);


        resultArray.add(curSearchElement);

    }

    public Integer getNumberOfOperation(String select){

/* Operations:
1 - equal
2 - like
3 - between
4 - greater than
5 - less than
6 - start with
7 - in the list
*/
        Integer result = null;
        if(select.equals("=") ){
            result = 1;
        } else if(select.equals("содержит") ){
            result = 2;
        } else if(select.equals("от/до") ){
            result = 3;
        } else if(select.equals(">") ){
            result = 4;
        } else if(select.equals("<") ){
            result = 5;
        } else if(select.equals("начинается") ){
            result = 6;
        } else if(select.equals("в списке") ){
            result = 7;
        }

        return result;
    }


    //конструктор для информативного заполения JSON
    public SearchParams(Boolean defaultValues) {
        if (defaultValues) {

            this.tab_personal_firstname     = new SearchSelect();
            this.tab_personal_lastname      = new SearchSelect();
            this.tab_personal_middlename    = new SearchSelect();

            this.sortProperty = "";
            this.sortDirection = "";
            this.size = 20;
            this.page = 0;

        }
    }

    public boolean searchCoreEquals(SearchParams searchParams) {
        return
                tab_personal_firstname.equals(searchParams.tab_personal_firstname)    &&
                tab_personal_lastname.equals(searchParams.tab_personal_lastname)      &&
                tab_personal_middlename.equals(searchParams.tab_personal_middlename);

    }

}