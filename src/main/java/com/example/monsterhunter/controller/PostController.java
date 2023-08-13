package com.example.monsterhunter.controller;

import com.example.monsterhunter.domain.EquipmentList;
import com.example.monsterhunter.domain.SkillList;
import com.example.monsterhunter.repository.EquipmentListRepository;
import com.example.monsterhunter.repository.SkillListRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/private/v1/monsterhunter")
@Slf4j

@RequiredArgsConstructor
public class PostController {

    private final EquipmentListRepository equipmentListRepository;

    private final SkillListRepository skillListRepository;


    //TODO Fix this mapping
    @PostMapping(value = "/addEquipment", consumes = "application/json", produces = "application/json")
    public void createEntry(@RequestBody EquipmentList newEquipment, SkillList newSkill) {
        EquipmentList newEquipmentToAdd = new EquipmentList();
        SkillList newSkillToAdd = new SkillList();

        newEquipmentToAdd.setName(newEquipment.getName());
        newSkillToAdd.setName((newSkill.getName()));
        newSkillToAdd.setSkill(newSkill.getSkill());
        newSkillToAdd.setSkillLevel(newSkill.getSkillLevel());

        equipmentListRepository.save(newEquipmentToAdd);
        skillListRepository.save(newSkillToAdd);
        return;
    }
}
