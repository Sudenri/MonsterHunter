package com.example.monsterhunter.service;

import com.example.monsterhunter.domain.EquipmentList;
import com.example.monsterhunter.repository.EquipmentListRepository;
import com.example.monsterhunter.response.EquipmentResponse;

import java.util.ArrayList;
import java.util.List;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
//This service is related for the Get controller to retrieve singular pieces of data
@Service
@Slf4j
@RequiredArgsConstructor
public class RetrieveEquipmentService {

    private final EquipmentListRepository equipmentListRepository;

    public List<EquipmentResponse> getAllEquipment(){
        log.info("This is the RetrieveEquipmentStep");
        List<EquipmentList> allEquipmentList = equipmentListRepository.findAll();
        List<EquipmentResponse> allEquipmentResponse = new ArrayList<>();
        for (EquipmentList allEquipment : allEquipmentList){
            allEquipmentResponse.add(EquipmentResponse.from(allEquipment));
        }
        return allEquipmentResponse;
    }

    public EquipmentResponse getEquipmentByName(String name){
        log.info("This is the RetrieveEquipmentStep");
        EquipmentList equipmentList = equipmentListRepository.findByName(name);
        EquipmentResponse equipmentResponse = EquipmentResponse.from(equipmentList);
        return equipmentResponse;
    }

    public List<EquipmentResponse> getEquipmentBySkill(String skill){
        List<EquipmentList> equipmentList = equipmentListRepository.findBySkill(skill);

        List<EquipmentResponse> response = new ArrayList<>();
        for (EquipmentList equipment:equipmentList) {
            EquipmentResponse equipmentResponse = EquipmentResponse.from(equipment);
            response.add(equipmentResponse);
        }
        return response;
    }


}

