package com.example.monsterhunter.steps;

import com.example.monsterhunter.response.EquipmentResponse;
import com.example.monsterhunter.service.RetrieveEquipmentService;
import com.example.monsterhunter.vo.CalculationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class RetrieveEquipmentStep implements Step<CalculationRequest, CalculationRequest> {

    private final RetrieveEquipmentService retrieveEquipmentService;

    public CalculationRequest process(CalculationRequest calculationRequest) throws StepException {
        List<EquipmentResponse> allEquipmentResponse = retrieveEquipmentService.getAllEquipment();
        return calculationRequest;
    }
}
