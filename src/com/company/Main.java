package com.company;

import com.company.animal.mouse.Mouse;
import com.company.animal.bird.Bird;
import com.company.animal.bird.wing.Wing;
import com.company.animal.bird.wing.feather.Feather;
import com.company.animal.bird.wing.feather.FeatherSize;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Feather feather = new Feather("White ", FeatherSize.MIDDLE);
        Wing wing1 = new Wing(new ArrayList<>());
        Wing wing2 = new Wing(new ArrayList<>());
        wing1.getFeathers().add(feather);
        wing2.getFeathers().add(feather);
        Bird bird = new Bird("Clvl ", new ArrayList<>());
        bird.getWings().add(wing1);
        bird.getWings().add(wing2);
        for (int i = 0; i < bird.getWings().size(); i++) {
            System.out.println("Feathers color is " + bird.getWings().get(i).getFeathers().get(0).getColor() + ",and size is " + bird.getWings().get(i).getFeathers().get(0).getFeatherSize() + ".");
        }
        Mouse mouse = new Mouse(" Vaxo");
        bird.fly();
        bird.eat(mouse);
    }
}
