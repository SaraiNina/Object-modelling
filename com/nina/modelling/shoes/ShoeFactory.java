package com.nina.modelling.shoes;

public class ShoeFactory extends Shoe {

    public static void main(String[] args) {

        KidsShoe kidsShoe = new KidsShoe("Summer");
        kidsShoe.getAccessories();
        MenShoe menShoe = new MenShoe("Ama");
        MenShoe menShoe1 = new MenShoe();
        menShoe.getBrand();
        Shoe shoe = new Shoe();
        Shoe shoe1 = new Shoe();
        WomanShoe womanShoe = new WomanShoe("Zar");
        WomanShoe womanShoe1 = new WomanShoe("Flower", "Zar");
        womanShoe1.getCollections();



    }

}


