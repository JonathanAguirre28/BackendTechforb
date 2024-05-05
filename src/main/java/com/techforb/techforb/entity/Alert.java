package com.techforb.techforb.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "alert")
public class Alert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Long quantity;

    private String status;

}
