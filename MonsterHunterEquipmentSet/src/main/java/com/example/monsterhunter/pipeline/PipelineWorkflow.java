package com.example.monsterhunter.pipeline;

import com.example.monsterhunter.response.EquipmentResponse;
import com.example.monsterhunter.service.CalculateService;
import com.example.monsterhunter.service.FilterService;
import com.example.monsterhunter.service.RetrieveEquipmentService;
import org.springframework.stereotype.Service;

import java.util.List;


/*
1. GetController (Input: JSON SkillList, Output: String SkillList)
2. Repo call (return List<All Equipment>)
3. Filter Service (return List <Filtered Equipment>
4. Calculate best set (return List<Best Equipment>
 */
@Service
public class PipelineWorkflow {

    private final RetrieveEquipmentService retrieveEquipmentService;
    private final FilterService filterService;
    private final CalculateService calculateService;

    public PipelineWorkflow(RetrieveEquipmentService retrieveEquipmentService, FilterService filterService, CalculateService calculateService) {
        this.retrieveEquipmentService = retrieveEquipmentService;
        this.filterService = filterService;
        this.calculateService = calculateService;
    }

    public List<EquipmentResponse> process(List<String> skillList) {
        return null;
    }

}
