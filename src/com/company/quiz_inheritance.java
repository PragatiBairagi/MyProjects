package com.company;

class Animal{
    String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        System.out.println("There are many different types of animals");
        this.name = name;
    }
}

class Dog extends Animal{
    String species;

    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        System.out.println("dogs come under animals");
        this.species = species;
    }
}

public class quiz_inheritance {
    public static void main(String[] args) {
        Animal ani = new Animal();
        ani.setName("dog, cow, cat");
        System.out.println(ani.getName());


        Dog d = new Dog();
        d.setSpecies("dog means shiro...");
        System.out.println(d.getSpecies());
    }
}
