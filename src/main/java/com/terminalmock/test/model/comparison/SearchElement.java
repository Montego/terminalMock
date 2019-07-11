package com.terminalmock.test.model.comparison;

/* Operations:
1 - equal
2 - like
3 - between
4 - greater than
5 - less than
6 - start with
*/

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;


@Setter
@Getter
public class SearchElement {
    //TODO сделать private
    private String propertyName;
    private Comparable comparisonValue1;
    private Comparable comparisonValue2;
    private ArrayList<Object> listOfValues;
    private Integer operation;
    private String parentPropertyName;


}
