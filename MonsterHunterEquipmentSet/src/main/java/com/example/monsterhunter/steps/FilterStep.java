package com.example.monsterhunter.steps;

import com.example.monsterhunter.service.FilterService;
import com.example.monsterhunter.vo.CalculationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class FilterStep implements Step<CalculationRequest, CalculationRequest> {
    private final FilterService filterService;

    public CalculationRequest process(CalculationRequest calculationRequest) {
        return filterService.filter(calculationRequest);
    }

}
