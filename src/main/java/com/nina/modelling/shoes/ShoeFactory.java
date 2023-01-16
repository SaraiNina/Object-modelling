package com.nina.modelling.shoes;


public class ShoeFactory extends Shoe {

    public static void main(String[] args) {

        KidShoe kidShoeLittleBaby = new KidShoe("Summer", "Flower", "Orthopedic");
        KidShoe kidShoeNewCategory = new KidShoe("Summer");
        KidShoe kidShoeWinter = new KidShoe("Winter", "Orthopedic");
        System.out.println("KidsShoe Category = " + kidShoeNewCategory.category());
        System.out.println("KidsShoe Accessory = " + kidShoeLittleBaby.accessory());
        System.out.println("KidsShoe = " + kidShoeWinter.type());

        ManShoe maryShoe = new ManShoe();
        ManShoe manShoeFromZara = new ManShoe("Zara"); //TODO: no numbers in variable names
        System.out.println("MenShoe = " + manShoeFromZara.brand() + "" + maryShoe.brand());


        Shoe jonsShoe = new Shoe();
        Shoe shoeWithZipperAndMadeOfSkin = new Shoe("Skin", "Zipper");
        Shoe shoeAnotherMaterial = new Shoe("Skin");
        System.out.println(" Shoe ClosingType = " + jonsShoe.closingType());
        System.out.println(" Shoe Material = " + shoeWithZipperAndMadeOfSkin.material() + "" + shoeAnotherMaterial.material());
        System.out.println(" Shoe Model = " + jonsShoe.model());


        WomanShoe womanAccessory = new WomanShoe("Flower", "Zar");
        WomanShoe womanGroup = new WomanShoe("Ama");
        WomanShoe womanShoe = new WomanShoe();
        System.out.println("Woman Shoe =" + "" + womanAccessory.accessory() + womanAccessory.group());
        System.out.println("New collection = " + womanGroup.group());
        System.out.println("No Shoe = " + womanShoe);

    }

}


