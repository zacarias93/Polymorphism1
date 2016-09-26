package io.zipcoder.pets;

/**
 * Created by zaclee on 9/26/16.
 */
public class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }

    public String speak() {
        return "Woof!";
    }
}
