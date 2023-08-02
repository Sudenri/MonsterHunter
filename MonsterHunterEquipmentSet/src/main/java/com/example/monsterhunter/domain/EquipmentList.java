package com.example.monsterhunter.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Getters for all fields, setters for all non-final fields, and appropriate toString, equals and hashCode implementations that involve the fields of the class, and a constructor that initializes all final fields, as well as all non-final fields with no initializer that have been marked with @NonNull, in order to ensure the field is never null.
@NoArgsConstructor
@Entity(name = "EQUIPMENT")
public class EquipmentList {

    @Id
    @Column(name = "NAME") //@Column annotation is used to define the column in database that maps annotated field.
    private String name;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "SLOTS")
    private Long slots;

    @Column(name = "SKILL")
    private String skill;

    @Column(name = "LEVEL")
    private Long skillLevel;

    @Column(name = "DEFENSE")
    private Long defensePoints;

    @Column(name = "FIRE_RESISTANCE")
    private Long fireRes;

    @Column(name = "WATER_RESISTANCE")
    private Long waterRes;

    @Column(name = "LIGHTNING_RESISTANCE")
    private Long lightningRes;

    @Column(name = "ICE_RESISTANCE")
    private Long iceRes;

    @Column(name = "DRAGON_RESISTANCE")
    private Long dragonRes;

}
