package com.example.monsterhunter.service;

import com.example.monsterhunter.response.EquipmentResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilterService {

    public List<EquipmentResponse> filter(List<String> desiredSkills, List<EquipmentResponse> allEquipmentResponse){
        //Stream to filter out
        List<EquipmentResponse> eligibleEquipment = null;
        return eligibleEquipment;
    }
}
