package com.example.monsterhunter.steps;

import com.example.monsterhunter.response.EquipmentResponse;
import com.example.monsterhunter.service.FilterService;

import java.util.List;

public class FilterStep {
    private final FilterService filterService;

    public FilterStep (FilterService filterService){
        this.filterService = filterService;
    }

    public List<EquipmentResponse> process(List<String> desiredSkills, List<EquipmentResponse> allEquipmentResponse){
        return filterService.filter(desiredSkills, allEquipmentResponse);
    }

}
