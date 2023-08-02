package com.example.monsterhunter.controller;

import com.example.monsterhunter.response.GetEquipmentResponse;
import com.example.monsterhunter.service.RetrieveEquipmentService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/private/v1/monsterhunter/")
@Slf4j

public class GetController {

    private final RetrieveEquipmentService retrieveEquipmentService;

    public GetController(RetrieveEquipmentService retrieveEquipmentService) {
        this.retrieveEquipmentService = retrieveEquipmentService;
    }

    private static final String template = "Calculating the best set now";

    @GetMapping("/calculation")
    public String response() {
        return template;
    }

    @GetMapping(value = "/getEquipmentByName", produces = MediaType.APPLICATION_JSON_VALUE)
    //In Get Methods: @RequestBody do not work. Instead pass the parameters in the URI's.
    public GetEquipmentResponse EquipmentByName(@RequestParam String name) {
        return retrieveEquipmentService.getEquipmentByName(name);
    }

    @GetMapping(value = "/getEquipmentBySkill", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<GetEquipmentResponse> EquipmentBySkill(@RequestParam String skill) {
        return retrieveEquipmentService.getEquipmentBySkill(skill);
    }
}
