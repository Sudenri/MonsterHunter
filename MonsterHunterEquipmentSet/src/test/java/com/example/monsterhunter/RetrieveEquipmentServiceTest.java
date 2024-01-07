package com.example.monsterhunter;

import com.example.monsterhunter.repository.EquipmentListRepository;
import com.example.monsterhunter.service.RetrieveEquipmentService;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;

public class RetrieveEquipmentServiceTest {

    private final RetrieveEquipmentService retrieveEquipmentService;

    @Mock
    EquipmentListRepository equipmentListRepository;

    public RetrieveEquipmentServiceTest (RetrieveEquipmentService retrieveEquipmentService, EquipmentListRepository equipmentListRepository){
        this.retrieveEquipmentService = retrieveEquipmentService;
        this.equipmentListRepository = equipmentListRepository;
    }



}
