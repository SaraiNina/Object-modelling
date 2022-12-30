package com.nina.modelling.shoes;

import java.security.PublicKey;

public class Shoe {
    private String model;
    private String closingType;
    private String material;
    private int size;

   public Shoe(){

   }
   public Shoe(String model, String closingType) {
       this.closingType = closingType;
       this.closingType = model;
   }
   public Shoe(String material){
       this.material = material;
   }
public  Shoe(int size){
       this.size = size;

}
public String getModel(){
       return  model;
}
public String getClosingType(){
       return closingType;
}
public String getMaterial(){
       return material;
}
public int getSize(){
       return size;
}
}
