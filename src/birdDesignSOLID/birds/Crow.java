package birdDesignSOLID.birds;

import birdDesignSOLID.Bird;
import birdDesignSOLID.Flyer;

public class Crow extends Bird implements Flyer {
    @Override
    public void eat() {
        System.out.println("Crow eats seeds");
    }

    @Override
    public void makeSound() {
        System.out.println("Crow says: " + "kaw kaw");
    }

    @Override
    public void fly() {
        System.out.println("Crow flies at lower altitudes");
    }
}
