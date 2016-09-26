package io.zipcoder.pets;

/**
 * Created by zaclee on 9/26/16.
 */
public class PetFactory {

    public Pet makeNewPet(String kind, String name) {

        if (kind.equalsIgnoreCase("dog")) {
            return new Dog(name);
        }

        else if (kind.equalsIgnoreCase("cat")) {
            return new Cat(name);
        }

        else if (kind.equalsIgnoreCase("dragon")) {
            return new Dragon(name);
        }

        else {
            System.out.println("Sorry we don't recognize that type of pet.");
            return new Pet(name);
        }
    }
}
