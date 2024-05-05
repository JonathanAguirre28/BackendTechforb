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
    private String iconNumber;

    @NotEmpty
    private Long number;

    @NotEmpty
    private String icon;

}
