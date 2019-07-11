package com.terminalmock.test.controllers;

import com.terminalmock.test.entities.entity.PersonInfo;
import com.terminalmock.test.model.comparison.SearchForm;
import com.terminalmock.test.model.comparison.SearchParams;
import com.terminalmock.test.services.SearchPersonInfoSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("/rest")
public class PersonInfoController {

    private final
    SearchPersonInfoSvc searchPersonInfoSvc;

    @Autowired
    public PersonInfoController(SearchPersonInfoSvc searchPersonInfoSvc) {
        this.searchPersonInfoSvc = searchPersonInfoSvc;
    }


//POST

    /**
     * Выполняет поиск записей по указанной в классе SearchParams структуре параметров
     *
     * @param input - SearchForm.SearchParams - значения параметров, если параметр не указан необходимо указать null тогда
     *               он не будет участвовать в фильтрации
     * @return Iterable<PersonInfo> - возвращает список свидетельств подходящих по описанию
     */
    @PostMapping("/searchPersonInfo")
    public Iterable<PersonInfo> searchMedCerts(@RequestBody SearchForm input, HttpServletRequest request) {

        SearchParams params = input.getSearchForm();

        return searchPersonInfoSvc.searchMedCerts(params,request);

    }

    @GetMapping("/getEmptySearchParams")
    public SearchForm getEmptySearchParams() {

        return searchPersonInfoSvc.getEmptySearchParams();

    }

}
