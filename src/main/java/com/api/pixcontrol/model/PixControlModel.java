package com.api.pixcontrol.model;

import jakarta.persistence.*;

import java.util.UUID;

import java.io.Serializable;

@Entity
@Table(name = "TB_PIX_USER")
public class PixControlModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column (nullable = false, unique = true, length = 11)
    private int pixUserCPF;

    @Column (nullable = false, length = 130)
    private String pixUserName;

    @Column (nullable = false, length = 70)
    private String nameOfInstitutionName;

    @Column (nullable = false, unique = true, length = 11)
    private int pixKeyCPF;

    @Column (nullable = false, unique = true, length = 100)
    private String pixKeyEmail;

    @Column (nullable = false, unique = true, length = 11)
    private int pixKeyCell;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

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

    public String getNameOfInstitutionName() {
        return nameOfInstitutionName;
    }

    public void setNameOfInstitutionName(String nameOfInstitutionName) {
        this.nameOfInstitutionName = nameOfInstitutionName;
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

    public int getPixKeyCell() {
        return pixKeyCell;
    }

    public void setPixKeyCell(int pixKeyCell) {
        this.pixKeyCell = pixKeyCell;
    }
}
