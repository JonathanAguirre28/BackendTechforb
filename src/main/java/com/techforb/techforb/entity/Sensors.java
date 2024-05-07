package com.techforb.techforb.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "sensors")
public class Sensors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String reading;

    private Long numberReading;

    private String midLevel;

    private Long numberMid;

    private String redAlert;

    private Long numberRedAlert;

    private String icon;

}
