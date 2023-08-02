package com.example.monsterhunter.service;

import com.example.monsterhunter.domain.EquipmentList;
import com.example.monsterhunter.repository.EquipmentListRepository;
import com.example.monsterhunter.response.GetEquipmentResponse;
import jakarta.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RetrieveEquipmentService {

    private final EquipmentListRepository equipmentListRepository;

    public RetrieveEquipmentService(EquipmentListRepository equipmentListRepository){
        this.equipmentListRepository = equipmentListRepository;
    }

    public GetEquipmentResponse getEquipmentByName(String name){
        EquipmentList equipmentList = equipmentListRepository.findByName(name);
        GetEquipmentResponse getEquipmentResponse = GetEquipmentResponse.from(equipmentList);
        return getEquipmentResponse;
    }

    public List<GetEquipmentResponse> getEquipmentBySkill(String skill){
        List<EquipmentList> equipmentList = equipmentListRepository.findBySkill(skill);

        List<GetEquipmentResponse> response = new ArrayList<>();
        for (EquipmentList equipment:equipmentList) {
            GetEquipmentResponse getEquipmentResponse = GetEquipmentResponse.from(equipment);
            response.add(getEquipmentResponse);
        }

//        response.stream().sorted().collect(Collectors.toList());
        return response;
    }
}

