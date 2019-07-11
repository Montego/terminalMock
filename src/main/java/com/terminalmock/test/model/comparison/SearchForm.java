package com.terminalmock.test.model.comparison;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class SearchForm {

    private SearchParams searchForm;

    //конструктор для информативного заполения JSON
    public SearchForm(Boolean defaultValues) {
        if (defaultValues) {
            searchForm = new SearchParams(true);
        }
    }

}
