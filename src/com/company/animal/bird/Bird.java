package com.company.animal.bird;

import com.company.animal.Animal;
import com.company.animal.bird.wing.Wing;

import java.util.ArrayList;
import java.util.Objects;

public class Bird extends Animal implements Flyable {
    //region Propertys

    private ArrayList<Wing> wings;

    //endregion

    //region Constructors

    public Bird(String name, ArrayList<Wing> wings) {
        super(name);
        this.wings = wings;
    }

    public Bird(String name) {
        super(name);
    }

    public Bird(ArrayList<Wing> wings) {
        this.wings = wings;
    }

    public Bird() {
    }

    //endregion

    //region Public Methods

    public void eat(Animal animal) {
        System.out.println(getName() + "is eating" + animal.getName() + ".");
    }

    @Override
    public void fly() {
        if (wings.size() == 2) {
            System.out.println(getName() + "is flying.");
        } else {
            throw new RuntimeException("It is now bird.");
        }
    }

    //endregion

    //region Getter and Setter

    public ArrayList<Wing> getWings() {
        return wings;
    }

    public void setWings(ArrayList<Wing> wings) {
        this.wings = wings;
    }

    //endregion

    //region equals,hashCode and toString Public Methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return Objects.equals(wings, bird.wings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wings);
    }

    @Override
    public String toString() {
        return "Bird{" +
                "wings=" + wings +
                '}';
    }

    //endregion
}
