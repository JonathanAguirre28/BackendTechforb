package com.techforb.techforb.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateSensorsDto {

    @NotEmpty
    private String name;

    @NotEmpty
    private String reading;

    @NotEmpty
    private Long numberReading;

    @NotEmpty
    private String midLevel;

    @NotEmpty
    private Long numberMid;

    @NotEmpty
    private String redAlert;

    @NotEmpty
    private Long numberRedAlert;

    @NotEmpty
    private String icon;

}
