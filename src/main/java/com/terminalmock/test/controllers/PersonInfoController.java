package com.terminalmock.test.controllers;

import com.terminalmock.test.model.comparison.SearchForm;
import com.terminalmock.test.services.SearchPersonInfoSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rest")
public class PersonInfoController {

    private final
    SearchPersonInfoSvc searchPersonInfoSvc;

    @Autowired
    public PersonInfoController(SearchPersonInfoSvc searchPersonInfoSvc) {
        this.searchPersonInfoSvc = searchPersonInfoSvc;
    }

    
    @GetMapping("/getEmptySearchParams")
    public SearchForm getEmptySearchParams() {

        return searchPersonInfoSvc.getEmptySearchParams();

    }

}
