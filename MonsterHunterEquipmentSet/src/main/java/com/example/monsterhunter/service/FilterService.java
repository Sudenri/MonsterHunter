package com.example.monsterhunter.service;

import com.example.monsterhunter.response.EquipmentResponse;
import com.example.monsterhunter.vo.CalculationRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class FilterService {

    public CalculationRequest filter(CalculationRequest calculationRequest){
        //Stream to filter out
        log.info("This is the Filter Service");
        List<EquipmentResponse> eligibleEquipment = null;
        return calculationRequest;
    }
}
