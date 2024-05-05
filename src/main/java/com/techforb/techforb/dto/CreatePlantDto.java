package com.techforb.techforb.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatePlantDto {

    @NotEmpty
    private String icon;

    @NotEmpty
    private String country;

    @NotEmpty
    private String name;

    @NotEmpty
    private Long readings;

    @NotEmpty
    private Long mediumAlerts;

    @NotEmpty
    private Long redAlerts;

    @NotEmpty
    private String iconActions;
}
