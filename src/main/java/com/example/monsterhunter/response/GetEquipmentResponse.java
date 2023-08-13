package com.example.monsterhunter.response;

import com.example.monsterhunter.domain.EquipmentList;
import com.example.monsterhunter.domain.SkillList;
import java.util.List;
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

    private List<SkillList> skillList;

    private Long defensePoints;

    private Long fireRes;

    private Long waterRes;

    private Long lightningRes;

    private Long iceRes;

    private Long dragonRes;

    public static GetEquipmentResponse from(EquipmentList equipmentList, List<SkillList> skillList){
        GetEquipmentResponse getEquipmentResponse = new GetEquipmentResponse();

        getEquipmentResponse.setName(equipmentList.getName());
        getEquipmentResponse.setType(equipmentList.getType());
        getEquipmentResponse.setSlots(equipmentList.getSlots());
        getEquipmentResponse.setSkillList(skillList);
        getEquipmentResponse.setDefensePoints(equipmentList.getDefensePoints());
        getEquipmentResponse.setFireRes(equipmentList.getFireRes());
        getEquipmentResponse.setWaterRes(equipmentList.getWaterRes());
        getEquipmentResponse.setLightningRes(equipmentList.getLightningRes());
        getEquipmentResponse.setIceRes(equipmentList.getIceRes());
        getEquipmentResponse.setDragonRes(equipmentList.getDragonRes());

        return getEquipmentResponse;
    }
}
