package com.nina.modelling.shoes;

public class WomanShoe extends Shoe {
  private String collections;
  private String accessories;

   public WomanShoe(String accessories, String collections){
      this.accessories = accessories;
      this.collections  = collections;

   }
   public WomanShoe(String type, int price){

   }
   public WomanShoe(String collections){

}
   public String getAccessories(){
       return accessories;
   }
   public String getCollections(){
       return collections;
   }
}

