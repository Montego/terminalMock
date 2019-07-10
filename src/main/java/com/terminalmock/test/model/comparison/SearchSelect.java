package com.terminalmock.test.model.comparison;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Objects;

@NoArgsConstructor
@Getter
@Setter
@Component
public class SearchSelect {

    public String select; //Операция
    public String input;  //Значение

    @JsonFormat(pattern = "dd.MM.yyyy")
    public LocalDate fromDate;

    @JsonFormat(pattern = "dd.MM.yyyy")
    public LocalDate toDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SearchSelect searchSelect = (SearchSelect) o;

        if (!Objects.equals(select, searchSelect.select))       return false;
        if (!Objects.equals(input, searchSelect.input))         return false;
        if (!Objects.equals(fromDate, searchSelect.fromDate))   return false;
        return(Objects.equals(toDate, searchSelect.toDate));

    }

}
