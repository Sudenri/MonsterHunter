package com.example.monsterhunter.repository;

import com.example.monsterhunter.domain.EquipmentList;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipmentListRepository extends JpaRepository<EquipmentList, String> {
    EquipmentList findByName(String name);


}
