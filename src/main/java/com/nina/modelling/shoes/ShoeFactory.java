package com.nina.modelling.shoes;



public class ShoeFactory extends Shoe {

    public static void main(String[] args) {

        KidShoe kidShoe = new KidShoe("Summer", "Flower", "Orthopedic");
        KidShoe kidShoe1 = new KidShoe("Summer");
        KidShoe kidShoe2 = new KidShoe("Winter", "Orthopedic");
        System.out.println("KidsShoe Category = " + kidShoe1.category());
        System.out.println("KidsShoe Accessory = " + kidShoe.Accessory());
        System.out.println("KidsShoe = " + kidShoe2.Type());

        MenShoe menShoe = new MenShoe();
        MenShoe menShoe1 = new MenShoe("Zara");
        System.out.println("MenShoe = " + menShoe1.getBrand() + "" + menShoe.getBrand());


        Shoe shoe = new Shoe();
        Shoe shoe1 = new Shoe("Skin", "Zipper");
        Shoe shoe2 = new Shoe("Skin");
        System.out.println(" Shoe ClosingType = " + shoe.getClosingType());
        System.out.println(" Shoe Material = " + shoe1.getMaterial() + "" + shoe2.getMaterial());
        System.out.println(" Shoe Model = " + shoe.getModel());



        WomanShoe womanShoe1 = new WomanShoe("Flower", "Zar");
        WomanShoe womanShoe = new WomanShoe("Ama");
        WomanShoe womanShoe2 = new WomanShoe();
        System.out.println("WomanShoe = " + womanShoe1.getAccessory());
        System.out.println("New collection = " + womanShoe.getCollections());
        System.out.println(womanShoe2.getAccessory());

    }

}


