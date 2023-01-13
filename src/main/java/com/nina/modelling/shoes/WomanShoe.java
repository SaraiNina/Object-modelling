package com.nina.modelling.shoes;

public class WomanShoe extends Shoe {
    private String collections;  //TODO: probably list of strings
    private String accessory;

    public WomanShoe() {
    }

    public WomanShoe(String collections) {
        this.collections = collections;
    }

    public WomanShoe(String accessory, String collections) {
        this.accessory = accessory;
        this.collections = collections;
    }

    public String collection() {
        return collections;
    }

    public String accessory() {
        return accessory;
    }
}

