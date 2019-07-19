package com.terminalmock.test.services.dtoServices;

import com.terminalmock.test.dto.ConditionsDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConditionsDtoService {
    public List<ConditionsDto> getAll() {

        List<ConditionsDto> conditionsDtos = new ArrayList<>();
        ConditionsDto conditionsDto1 = new ConditionsDto(
                "One","One","one","one","one","one",false
        );
        ConditionsDto conditionsDto2 = new ConditionsDto(
                "two","two","two","two","two","two",false
        );
        ConditionsDto conditionsDto3 = new ConditionsDto(
                "three","three","three","three","three","three",false
        );

        conditionsDtos.add(conditionsDto1);
        conditionsDtos.add(conditionsDto2);
        conditionsDtos.add(conditionsDto3);
        conditionsDtos.add(conditionsDto1);
        conditionsDtos.add(conditionsDto2);
        conditionsDtos.add(conditionsDto3);
        conditionsDtos.add(conditionsDto1);
        conditionsDtos.add(conditionsDto2);
        conditionsDtos.add(conditionsDto3);


        return conditionsDtos;
    }
}
