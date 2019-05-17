package com.cskaoyan.bean;

/**
 * Created by VAP
 * Date 2019/5/17  Time 15:02
 */
public class Material {
    private String materialId;

    private String materialType;

    private String status;

    private Integer remaining;

    private String note;

    public Material() {
    }

    @Override
    public String toString() {
        return "Material{" +
                "materialId='" + materialId + '\'' +
                ", materialType='" + materialType + '\'' +
                ", status='" + status + '\'' +
                ", remaining=" + remaining +
                ", note='" + note + '\'' +
                '}';
    }

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getRemaining() {
        return remaining;
    }

    public void setRemaining(Integer remaining) {
        this.remaining = remaining;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Material(String materialId, String materialType, String status, Integer remaining, String note) {
        this.materialId = materialId;
        this.materialType = materialType;
        this.status = status;
        this.remaining = remaining;
        this.note = note;
    }
}
