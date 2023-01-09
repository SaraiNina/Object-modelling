package com.nina.modelling.shoes;


public class Shoe {
    private String model;
    private String closingType;
    private String material;

    public Shoe() {
    }

    public Shoe(String model, String closingType) {
        this.model = model;
        this.closingType = closingType;
    }

    public Shoe(String material) {
        this.material = material;
    }

    public String getModel() {
        return model;
    }

    public String getClosingType() {
        return closingType;
    }

    public String getMaterial() {
        return material;
    }

}
