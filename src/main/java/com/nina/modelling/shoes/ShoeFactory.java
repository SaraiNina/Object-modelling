package com.nina.modelling.shoes;



public class ShoeFactory extends Shoe {

    public static void main(String[] args) {

        KidShoe kidShoe = new KidShoe("Summer", "Flower", "Orthopedic");
        KidShoe kidShoe1 = new KidShoe("Summer");
        KidShoe kidShoe2 = new KidShoe("Winter", "Orthopedic");
        System.out.println("KidsShoe Category = " + kidShoe1.category());
        System.out.println("KidsShoe Accessory = " + kidShoe.accessory());
        System.out.println("KidsShoe = " + kidShoe2.type());

        ManShoe manShoe = new ManShoe();
        ManShoe manShoe1 = new ManShoe("Zara");
        System.out.println("MenShoe = " + manShoe1.brand() + "" + manShoe.brand());


        Shoe shoe = new Shoe();
        Shoe shoe1 = new Shoe("Skin", "Zipper");
        Shoe shoe2 = new Shoe("Skin");
        System.out.println(" Shoe ClosingType = " + shoe.closingType());
        System.out.println(" Shoe Material = " + shoe1.material() + "" + shoe2.material());
        System.out.println(" Shoe Model = " + shoe.model());



        WomanShoe womanShoe = new WomanShoe("Flower", "Zar");
        WomanShoe womanCollection = new WomanShoe("Ama");
        WomanShoe womanDefault = new WomanShoe();
        System.out.println("Woman Shoe =" + "" + womanShoe.accessory() + womanShoe.collection());
        System.out.println("New collection = " + womanCollection.collection());
        System.out.println("No Shoe = " + womanDefault);

    }

}


