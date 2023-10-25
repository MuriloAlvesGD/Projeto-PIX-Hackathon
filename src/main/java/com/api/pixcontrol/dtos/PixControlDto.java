package com.api.pixcontrol.dtos;

import jakarta.validation.constraints.NotBlank;

public class PixControlDto {

    @NotBlank
    private String pixUserName;
}
