package com.nina.modelling.shoes;

public class KidsShoe extends Shoe {
    private String category;
    private String accessory;
    private String type;

    public KidsShoe(String category, String accessory, String type) {
        this.category = category;
        this.accessory = accessory;
        this.type = type;
    }

    public KidsShoe(String category){
        this.category = category;
    }
    public KidsShoe(String accessory, String type){
        this.accessory = accessory;
        this.type = type;
    }

    public String category(){
        return category;
    }
    public String getAccessory(){
        return accessory;
    }
    public String getType(){
        return type;
    }
}
