package com.techforb.techforb.dto;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateAlertDto {

    @NotEmpty
    private String name;
    @NotEmpty
    private String status;
    @NotNull
    private Long quantity;

}
