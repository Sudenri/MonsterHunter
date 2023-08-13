package com.example.monsterhunter.repository;

import com.example.monsterhunter.domain.EquipmentList;
import com.example.monsterhunter.domain.SkillList;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillListRepository extends JpaRepository<SkillList, String> {

    List<SkillList> findBySkill(String skill);

    List<SkillList> findByName(String equipmentList);
}
