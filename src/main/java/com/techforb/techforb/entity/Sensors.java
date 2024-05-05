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

    private String iconNumber;

    private Long number;

    private String icon;

}
