package com.example.monsterhunter.repository;

import com.example.monsterhunter.domain.EquipmentList;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipmentListRepository extends JpaRepository<EquipmentList, String> {
    EquipmentList findByName(String name);

    /*@Query("FROM EquipmentList WHERE name=:name") //SEARCH JQL
    EquipmentList dflkajelfkajeof(String name); //Option 1*/

    //EquipmentList findByNameAndWaterRes(String name); //Option 2: Query: Starts with "findBy" + parameters of the Entity + Connectors e.g. "And"
}
