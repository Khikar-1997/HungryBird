package com.company.animal.bird.wing.feather;

import java.util.Objects;

public class Feather {
    //region Propertys

    private String color;
    private FeatherSize featherSize;

    //endregion

    //region Constructors

    public Feather(String color, FeatherSize featherSize) {
        this.color = color;
        this.featherSize = featherSize;
    }

    public Feather() {
    }

    //endregion

    //region Getter and Setter

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public FeatherSize getFeatherSize() {
        return featherSize;
    }

    public void setFeatherSize(FeatherSize featherSize) {
        this.featherSize = featherSize;
    }

    //endregion

    //region equals,hashCode and toString Public Methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feather feather = (Feather) o;
        return Objects.equals(color, feather.color) &&
                featherSize == feather.featherSize;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, featherSize);
    }

    @Override
    public String toString() {
        return "Feather{" +
                "color='" + color + '\'' +
                ", featherSize=" + featherSize +
                '}';
    }

    //endregion
}
