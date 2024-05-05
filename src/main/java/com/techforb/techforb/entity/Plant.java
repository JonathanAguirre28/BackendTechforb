package com.techforb.techforb.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "plant")
public class Plant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String icon;

    private String country;

    private String name;

    private Long readings;

    private Long mediumAlerts;

    private Long redAlerts;

    private String iconActions; 

}
