package io.zipcoder.pets;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private int numOfPets;
    private String kindOfPet;
    private String petName;
    Scanner scan;
    List<Pet> arrayOfPets;
    PetFactory petFactory;

    UserInterface() {
        scan = new Scanner(System.in);
        arrayOfPets = new ArrayList<Pet>();
        petFactory = new PetFactory();
    }

    public int howManyPets() {
        System.out.println("How many pets do you have?");
        numOfPets = scan.nextInt();
        return numOfPets;
    }

    public void getKindOfPet() {
        System.out.println("Is your pet a dog, cat, or dragon??");
        kindOfPet = scan.next();
    }

    public void getPetName() {
        System.out.println("What is the name of your pet?");
        petName = scan.next();
    }

    public void printPets() {
        for(Pet x : arrayOfPets) {
            System.out.println(x.getName() + " says " + x.speak());
        }
    }

    public void getInformation() {
        howManyPets();
        for(int i =0; i<numOfPets; i++) {
            getKindOfPet();
            getPetName();
            arrayOfPets.add(petFactory.makeNewPet(kindOfPet,petName));
        }
        printPets();
    }

}
