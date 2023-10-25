package com.api.pixcontrol.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class PixControlDto {

    @NotBlank
    @Size (max=11)
    private int pixUserCPF;

    @NotBlank
    private String pixUserName;

    @NotBlank
    private String nameOfInstituitionName;

    @NotBlank
    @Size (max = 11)
    private int pixKeyCPF;

    @NotBlank
    private String pixKeyEmail;

    @NotBlank
    @Size (max = 11)
    private String pixKeyCell;

    public int getPixUserCPF() {
        return pixUserCPF;
    }

    public void setPixUserCPF(int pixUserCPF) {
        this.pixUserCPF = pixUserCPF;
    }

    public String getPixUserName() {
        return pixUserName;
    }

    public void setPixUserName(String pixUserName) {
        this.pixUserName = pixUserName;
    }

    public String getNameOfInstituitionName() {
        return nameOfInstituitionName;
    }

    public void setNameOfInstituitionName(String nameOfInstituitionName) {
        this.nameOfInstituitionName = nameOfInstituitionName;
    }

    public int getPixKeyCPF() {
        return pixKeyCPF;
    }

    public void setPixKeyCPF(int pixKeyCPF) {
        this.pixKeyCPF = pixKeyCPF;
    }

    public String getPixKeyEmail() {
        return pixKeyEmail;
    }

    public void setPixKeyEmail(String pixKeyEmail) {
        this.pixKeyEmail = pixKeyEmail;
    }

    public String getPixKeyCell() {
        return pixKeyCell;
    }

    public void setPixKeyCell(String pixKeyCell) {
        this.pixKeyCell = pixKeyCell;
    }
}
