package com.example.monsterhunter.service;

import com.example.monsterhunter.domain.EquipmentList;
import com.example.monsterhunter.response.EquipmentResponse;
import com.example.monsterhunter.vo.CalculationRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CalculateService {

    public List<EquipmentResponse> calculate(CalculationRequest calculationRequest) {
        log.info("This is the CalculationService");
        return null;
    }
}
