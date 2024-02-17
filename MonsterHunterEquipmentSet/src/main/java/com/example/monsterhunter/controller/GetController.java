package com.example.monsterhunter.controller;

import com.example.monsterhunter.pipeline.PipelineWorkflow;
import com.example.monsterhunter.response.EquipmentResponse;
import com.example.monsterhunter.service.ExcelService;
import com.example.monsterhunter.service.RetrieveEquipmentService;
import java.util.List;
import java.util.Map;

import com.example.monsterhunter.vo.CalculationRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/private/v1/monsterhunter/")
@Slf4j

public class GetController {

    @Autowired
    ExcelService fileService;
    private final RetrieveEquipmentService retrieveEquipmentService;

    private final PipelineWorkflow pipelineWorkflow;

    public GetController(RetrieveEquipmentService retrieveEquipmentService, PipelineWorkflow pipelineWorkflow) {
        this.retrieveEquipmentService = retrieveEquipmentService;
        this.pipelineWorkflow = pipelineWorkflow;
    }

    private static final String template = "Calculating the best set now";

    @GetMapping("/calculate")
    public List<EquipmentResponse> response(@RequestParam Map<String, Integer> desiredSkills) { //Don't use @RequestParam, need body
        CalculationRequest calculationRequest = new CalculationRequest();
        calculationRequest.setDesiredSkills(desiredSkills);
        return pipelineWorkflow.process(calculationRequest);
    }

    @GetMapping(value = "/getEquipmentByName", produces = MediaType.APPLICATION_JSON_VALUE)
    //In Get Methods: @RequestBody do not work. Instead pass the parameters in the URI's.
    public EquipmentResponse EquipmentByName(@RequestParam String name) {
        return retrieveEquipmentService.getEquipmentByName(name);
    }

    @GetMapping(value = "/getEquipmentBySkill", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<EquipmentResponse> EquipmentBySkill(@RequestParam String skill) {
        return retrieveEquipmentService.getEquipmentBySkill(skill);
    }
}
