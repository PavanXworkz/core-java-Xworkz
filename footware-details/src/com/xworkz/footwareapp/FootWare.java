package com.xworkz.footwareapp;

public class FootWare {
    private int productId;
    private String brandName;
    private int size;
    private String type;
    private double prize;
    private String materialType;

    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId){
        this.productId=productId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }
}
