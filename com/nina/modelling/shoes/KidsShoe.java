package com.nina.modelling.shoes;

public class KidsShoe extends Shoe {
    private String category;
    private String accessories;
    private String type;

    public KidsShoe(String category, String accessories, String type) {
        this.category = category;
        this.accessories = accessories;
        this.type = type;
    }

    public KidsShoe(String category){
        this.category = category;
    }
    public KidsShoe(String accessories, String type){
        this.accessories = accessories;
        this.type = type;
    }

    public String getCategory(){
        return category;
    }
    public String getAccessories(){
        return accessories;
    }
    public String getType(){
        return type;
    }
}
