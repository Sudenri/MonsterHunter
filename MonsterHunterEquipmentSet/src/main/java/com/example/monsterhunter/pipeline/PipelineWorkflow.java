package com.example.monsterhunter.pipeline;

import com.example.monsterhunter.response.EquipmentResponse;
import com.example.monsterhunter.steps.CalculateStep;
import com.example.monsterhunter.steps.FilterStep;
import com.example.monsterhunter.steps.RetrieveEquipmentStep;
import com.example.monsterhunter.vo.CalculationRequest;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


/*
1. GetController (Input: JSON SkillList, Output: Map<String, Integer> desiredSkills)
2. Repo call (return List<All Equipment>)
3. Filter Service (return List <Filtered Equipment>
4. Calculate best set (return List<Best Equipment>
 */
@Service
@Slf4j
@AllArgsConstructor
@RequiredArgsConstructor
public class PipelineWorkflow {

    public RetrieveEquipmentStep retrieveEquipmentStep;

    public FilterStep filterStep;

    public CalculateStep calculateStep;


    public List<EquipmentResponse> process(CalculationRequest calculationRequest) {
        Pipeline<CalculationRequest, List<EquipmentResponse>> pipeline = new Pipeline<>(new RetrieveEquipmentStep())
                .pipe(new FilterStep())
                .pipe(new CalculateStep());
        log.info("This is the pipeline {}", pipeline);
        System.out.println(pipeline.execute(calculationRequest));
        return null;

    }

}
