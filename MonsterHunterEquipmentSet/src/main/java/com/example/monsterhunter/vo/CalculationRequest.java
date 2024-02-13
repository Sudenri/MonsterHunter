package com.example.monsterhunter.vo;

import com.example.monsterhunter.response.EquipmentResponse;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class CalculationRequest {
     Map<String, Integer> desiredSkills;

     List<EquipmentResponse> AllEquipment;
}
