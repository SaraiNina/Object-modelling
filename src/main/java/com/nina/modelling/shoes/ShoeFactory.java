package com.nina.modelling.shoes;

public class ShoeFactory extends Shoe {

    public static void main(String[] args) {

       KidsShoe kidsShoe = new KidsShoe ("Summer", "Flower", "Ortopedic");
        kidsShoe.getAccessory();
        kidsShoe.getCategory();
        kidsShoe.getType();
        KidsShoe kidsShoe1 = new KidsShoe("Summer");
        kidsShoe1.getCategory();
        KidsShoe kidsShoe2 = new KidsShoe("Winter", "Orthopedic");
        kidsShoe2.getCategory();
        kidsShoe2.getType();
     System.out.println();
        MenShoe menShoe = new MenShoe();
        menShoe.getBrand();
        MenShoe menShoe1 = new MenShoe("Zara");
        menShoe1.getModel();

        Shoe shoe = new Shoe();
        shoe.getMaterial();
        Shoe shoe1 = new Shoe("Skin","Zipper");
        shoe1.getModel();
        shoe1.getClosingType();
        Shoe shoe2 = new Shoe("Skin");
        shoe2.getMaterial();

        WomanShoe womanShoe1 = new WomanShoe("Flower", "Zar");
        womanShoe1.getCollections();
        WomanShoe womanShoe = new WomanShoe("Ama");
        womanShoe1.getCollections();



    }

}


