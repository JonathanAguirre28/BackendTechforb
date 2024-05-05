package com.techforb.techforb.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PlantDto {
    private Long id;

    private String icon;

    private String country;

    private String name;

    private Long readings;

    private Long mediumAlerts;

    private Long redAlerts;

    private String iconActions;
}
