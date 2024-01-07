package com.example.monsterhunter.steps;

import com.example.monsterhunter.response.EquipmentResponse;
import com.example.monsterhunter.service.RetrieveEquipmentService;

import java.util.List;

public class RetrieveEquipmentStep {

    private final RetrieveEquipmentService retrieveEquipmentService;

    public RetrieveEquipmentStep(RetrieveEquipmentService retrieveEquipmentService) {
        this.retrieveEquipmentService = retrieveEquipmentService;
    }

    public List<EquipmentResponse> process(){
        return retrieveEquipmentService.getAllEquipment();
    }
}
