package com.example.monsterhunter.steps;

import com.example.monsterhunter.response.EquipmentResponse;
import com.example.monsterhunter.service.CalculateService;
import com.example.monsterhunter.vo.CalculationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class CalculateStep implements Step<CalculationRequest, List<EquipmentResponse>> {

    private final CalculateService calculateService;

    public List<EquipmentResponse> process(CalculationRequest eligibleEquipment){
        return calculateService.calculate(eligibleEquipment);
    }


}
