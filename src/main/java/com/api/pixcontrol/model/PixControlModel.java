package com.api.pixcontrol.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

import java.io.Serializable;

@Entity
@Table(name = "TB_PIX_USER")
public class PixControlModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String pixUserCpf;

    private String pixUserName;

    private String institutionName;

    private String pixKeyCpf;

    private String pixKeyEmail;

    private String pixKeyCell;

    private LocalDateTime registrationData;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getPixUserCpf() {
        return pixUserCpf;
    }

    public void setPixUserCpf(String pixUserCpf) {
        this.pixUserCpf = pixUserCpf;
    }

    public String getPixUserName() {
        return pixUserName;
    }

    public void setPixUserName(String pixUserName) {
        this.pixUserName = pixUserName;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getPixKeyCpf() {
        return pixKeyCpf;
    }

    public void setPixKeyCpf(String pixKeyCpf) {
        this.pixKeyCpf = pixKeyCpf;
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

    public LocalDateTime getRegistrationData() {
        return registrationData;
    }

    public void setRegistrationData(LocalDateTime registrationData) {
        this.registrationData = registrationData;
    }
}
