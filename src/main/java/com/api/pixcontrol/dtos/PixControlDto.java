package com.api.pixcontrol.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public record PixControlDto (@NotBlank String pixUserCpf , @NotBlank String pixUserName , @NotBlank String institutionName){
    public String getPixUserCpf(){
        return pixUserCpf;
    }
}
