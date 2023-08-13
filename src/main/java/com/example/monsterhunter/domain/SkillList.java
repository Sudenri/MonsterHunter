package com.example.monsterhunter.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity(name = "SKILL")
public class SkillList {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column (name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SKILL")
    private String skill;

    @Column(name = "LEVEL")
    private Long skillLevel;

}
