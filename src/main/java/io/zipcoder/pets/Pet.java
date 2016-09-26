package io.zipcoder.pets;


public class Pet {

    private String name;

    Pet(String name) {
        this.name = name;
    }

    public String speak() {
        return "I am a pet";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
