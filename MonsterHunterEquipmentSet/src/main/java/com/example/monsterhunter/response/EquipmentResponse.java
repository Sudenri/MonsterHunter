package com.example.monsterhunter.response;

import com.example.monsterhunter.domain.EquipmentList;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EquipmentResponse {

    private String name;

    private String type;

    private Long slots;

    private String skill;

    private Long skillLevel;

    private Long defensePoints;

    private Long fireRes;

    private Long waterRes;

    private Long lightningRes;

    private Long iceRes;

    private Long dragonRes;

    public static EquipmentResponse from(EquipmentList equipmentList){
        EquipmentResponse equipmentResponse = new EquipmentResponse();

        equipmentResponse.setName(equipmentList.getName());
        equipmentResponse.setType(equipmentList.getType());
        equipmentResponse.setSlots(equipmentList.getSlots());
        equipmentResponse.setSkill(equipmentList.getSkill());
        equipmentResponse.setSkillLevel(equipmentList.getSkillLevel());
        equipmentResponse.setDefensePoints(equipmentList.getDefensePoints());
        equipmentResponse.setFireRes(equipmentList.getFireRes());
        equipmentResponse.setWaterRes(equipmentList.getWaterRes());
        equipmentResponse.setLightningRes(equipmentList.getLightningRes());
        equipmentResponse.setIceRes(equipmentList.getIceRes());
        equipmentResponse.setDragonRes(equipmentList.getDragonRes());

        return equipmentResponse;
    }
}
