package com.example.monsterhunter.response;

import com.example.monsterhunter.domain.EquipmentList;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetEquipmentResponse {

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

    public static GetEquipmentResponse from(EquipmentList equipmentList){
        GetEquipmentResponse getEquipmentResponse = new GetEquipmentResponse();

        getEquipmentResponse.setName(equipmentList.getName());
        getEquipmentResponse.setType(equipmentList.getType());
        getEquipmentResponse.setSlots(equipmentList.getSlots());
        getEquipmentResponse.setSkill(equipmentList.getSkill());
        getEquipmentResponse.setSkillLevel(equipmentList.getSkillLevel());
        getEquipmentResponse.setDefensePoints(equipmentList.getDefensePoints());
        getEquipmentResponse.setFireRes(equipmentList.getFireRes());
        getEquipmentResponse.setWaterRes(equipmentList.getWaterRes());
        getEquipmentResponse.setLightningRes(equipmentList.getLightningRes());
        getEquipmentResponse.setIceRes(equipmentList.getIceRes());
        getEquipmentResponse.setDragonRes(equipmentList.getDragonRes());

        return getEquipmentResponse;
    }
}
