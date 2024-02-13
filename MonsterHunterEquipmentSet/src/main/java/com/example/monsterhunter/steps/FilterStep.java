package com.example.monsterhunter.steps;

import com.example.monsterhunter.response.EquipmentResponse;
import com.example.monsterhunter.service.FilterService;
import com.example.monsterhunter.vo.CalculationRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FilterStep implements Step<CalculationRequest, CalculationRequest>{
    public FilterService filterService;

    public CalculationRequest process(CalculationRequest calculationRequest){
        return filterService.filter(calculationRequest);
    }

}
