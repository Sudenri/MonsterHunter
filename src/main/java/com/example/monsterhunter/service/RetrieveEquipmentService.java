package com.example.monsterhunter.service;

import com.example.monsterhunter.domain.EquipmentList;
import com.example.monsterhunter.domain.SkillList;
import com.example.monsterhunter.repository.EquipmentListRepository;
import com.example.monsterhunter.repository.SkillListRepository;
import com.example.monsterhunter.response.GetEquipmentResponse;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RetrieveEquipmentService {

    private final EquipmentListRepository equipmentListRepository;
    private final SkillListRepository skillListRepository;

    public RetrieveEquipmentService(EquipmentListRepository equipmentListRepository,
                                    SkillListRepository skillListRepository) {
        this.equipmentListRepository = equipmentListRepository;
        this.skillListRepository = skillListRepository;
    }

    public GetEquipmentResponse getEquipmentByName(String name) {
        EquipmentList equipmentList = equipmentListRepository.findByName(name);
        List<SkillList> skillList = skillListRepository.findByName(equipmentList.getName());
        GetEquipmentResponse getEquipmentResponse = GetEquipmentResponse.from(equipmentList, skillList);
        return getEquipmentResponse;
    }

    public List<GetEquipmentResponse> getEquipmentBySkill(String skill){
        List<SkillList> skillList = skillListRepository.findBySkill(skill);
        List<GetEquipmentResponse> response = new ArrayList<>();
        for(SkillList individualEquip: skillList) {
            EquipmentList equipmentList = equipmentListRepository.findByName(individualEquip.getName());
            List<SkillList> temp1 = skillListRepository.findByName(equipmentList.getName());
            GetEquipmentResponse getEquipmentResponse = GetEquipmentResponse.from(equipmentList, temp1);
            response.add(getEquipmentResponse);
        }
        /*List<GetEquipmentResponse> response = new ArrayList<>();
        for (List<SkillList> skills:skillList) {
            GetEquipmentResponse getEquipmentResponse = GetEquipmentResponse.from(null, skills);
            response.add(getEquipmentResponse);
        }*/
        return response;
    }
}

