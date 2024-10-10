package it.lessons.java.inter.abs;

import it.lessons.java.inter.abs.FlyingAnimal;
import it.lessons.java.inter.abs.SwimmingAnimal;

public class main {

    public static void main(String[] args) {

        SwimmingAnimal a1 = new Dog();

        FlyingAnimal a2 = new Seagull();

        Animal a3 = new Snake();

        a1.swim();

    }
}
