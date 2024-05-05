package com.techforb.techforb.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AlertDto {
    private Long id;

    private String name;

    private String status;

    private Long quantity;
}
