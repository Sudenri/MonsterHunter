package com.example.monsterhunter.controller;

import com.example.monsterhunter.domain.EquipmentList;
import com.example.monsterhunter.repository.EquipmentListRepository;
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

    @PostMapping(value = "/addEquipment", consumes = "application/json", produces = "application/json")
    public EquipmentList createEntry(@RequestBody EquipmentList newEntry) {
        return equipmentListRepository.save(newEntry);
    }
}
