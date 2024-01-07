package com.example.monsterhunter.steps;

import com.example.monsterhunter.response.EquipmentResponse;
import com.example.monsterhunter.service.CalculateService;

import java.util.List;

public class CalculateStep {

    private final CalculateService calculateService;

    public CalculateStep (CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    public List<EquipmentResponse> process(List<EquipmentResponse> eligibleEquipment, List<String>desiredSkills){
        return calculateService.calculate(eligibleEquipment, desiredSkills);
    }
}
