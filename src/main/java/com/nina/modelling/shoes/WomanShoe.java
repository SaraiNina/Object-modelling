package com.nina.modelling.shoes;

public class WomanShoe extends Shoe {
  private String collections;
  private String accessory;

   public WomanShoe(String accessory, String collections){
      this.accessory = accessory;
      this.collections  = collections;

   }

   public WomanShoe(String collections){
   this.collections = collections;
}
   public String getAccessory(){
       return accessory;
   }
   public String getCollections(){
       return collections;
   }
}

