package com.nina.modelling.shoes;


public class Shoe {
    private String model;
    private String closingType;
    private String material;

    public Shoe() {
    }

    public Shoe(String material) {
        this.material = material;
    }

    public Shoe(String model, String closingType) {
        this.model = model;
        this.closingType = closingType;
    }

    public String model() {
        return model;
    }

    public String closingType() {
        return closingType;
    }

    public String material() {
        return material;
    }

}
