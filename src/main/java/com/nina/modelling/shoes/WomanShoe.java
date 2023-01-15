package com.nina.modelling.shoes;

public class WomanShoe extends Shoe {
    private String group;
    private String accessory;

    public WomanShoe() {
    }

    public WomanShoe(String group) {
        this.group = group;
    }

    public WomanShoe(String accessory, String group) {
        this.accessory = accessory;
        this.group = group;
    }

    public String group() {
        return group;
    }

    public String accessory() {
        return accessory;
    }
}

