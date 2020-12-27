package com.springboot.entity;

public class Dept {
    private Integer dNo;

    private String dName;

    private String dParent;

    private Integer dCondition;

    private String dNote;

    private String dPrincipal;

    private String dTel;

    public Integer getdNo() {
        return dNo;
    }

    public void setdNo(Integer dNo) {
        this.dNo = dNo;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getdParent() {
        return dParent;
    }

    public void setdParent(String dParent) {
        this.dParent = dParent;
    }

    public Integer getdCondition() {
        return dCondition;
    }

    public void setdCondition(Integer dCondition) {
        this.dCondition = dCondition;
    }

    public String getdNote() {
        return dNote;
    }

    public void setdNote(String dNote) {
        this.dNote = dNote;
    }

    public String getdPrincipal() {
        return dPrincipal;
    }

    public void setdPrincipal(String dPrincipal) {
        this.dPrincipal = dPrincipal;
    }

    public String getdTel() {
        return dTel;
    }

    public void setdTel(String dTel) {
        this.dTel = dTel;
    }
}