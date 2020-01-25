package com.company.animal.bird.wing;

import com.company.animal.bird.wing.feather.Feather;

import java.util.ArrayList;
import java.util.Objects;

public class Wing {
    //region Propertys

    private ArrayList<Feather> feathers;

    //endregion

    //region Constructors

    public Wing(ArrayList<Feather> feathers) {
        this.feathers = feathers;
    }

    public Wing() {
    }

    //endregion

    //region Getter and Setter

    public ArrayList<Feather> getFeathers() {
        return feathers;
    }

    public void setFeathers(ArrayList<Feather> feathers) {
        this.feathers = feathers;
    }

    //endregion

    //region equals,hashCode and toString Public Methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wing wing = (Wing) o;
        return Objects.equals(feathers, wing.feathers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feathers);
    }

    @Override
    public String toString() {
        return "Wing{" +
                "feathers=" + feathers +
                '}';
    }

    //endregion
}
