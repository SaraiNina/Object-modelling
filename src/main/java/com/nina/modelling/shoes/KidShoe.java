package com.nina.modelling.shoes;

public class KidShoe extends Shoe {
    private String category;
    private String accessory;
    private String type;

    public KidShoe(String category, String accessory, String type) {
        this.category = category;
        this.accessory = accessory;
        this.type = type;
    }

    public KidShoe(String category) {
        this.category = category;
    }

    public KidShoe(String accessory, String type) {
        this.accessory = accessory;
        this.type = type;
    }

    public String category() {
        return category;
    }

    public String Accessory() {
        return accessory;
    }

    public String Type() {
        return type;
    }
}
