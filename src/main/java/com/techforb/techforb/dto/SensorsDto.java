package com.techforb.techforb.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SensorsDto {
    private Long id;

    private String name;

    private String iconNumber;

    private Long number;

    private String icon;

}
