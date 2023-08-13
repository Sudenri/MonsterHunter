package com.example.monsterhunter.service;

import com.example.monsterhunter.domain.EquipmentList;
import com.example.monsterhunter.domain.SkillList;
import com.example.monsterhunter.repository.EquipmentListRepository;
import com.example.monsterhunter.repository.SkillListRepository;
import com.example.monsterhunter.sql.ExcelHelper;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


@Service
public class ExcelService {
    @Autowired
    EquipmentListRepository equipmentListRepository;
    @Autowired
    SkillListRepository skillListRepository;

    public void save(MultipartFile file) {
        try {
            List<EquipmentList> equipmentLists = ExcelHelper.excelToEquipmentList(file.getInputStream());
            List<SkillList> skillLists = ExcelHelper.excelToSkillList(file.getInputStream());
            equipmentListRepository.saveAll(equipmentLists);
            skillListRepository.saveAll(skillLists);
        } catch (IOException e) {
            throw new RuntimeException("fail to store excel data: " + e.getMessage());
        }
    }

    public List<EquipmentList> getAllEquipmentList() {
        return equipmentListRepository.findAll();
    }
}
