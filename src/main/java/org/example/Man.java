package org.example;

public class Man extends Person {

    public Man(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public boolean isRetired() {
        return getAge() >= 65;
    }

}

