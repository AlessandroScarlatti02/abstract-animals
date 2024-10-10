package it.lessons.java.inter.abs;

public abstract class Animal implements FlyingAnimal, SwimmingAnimal {

    public void sleep() {

        System.out.println("Zzz");
    }

    public abstract void towards();

    public abstract void eat();

    public void say(String Animal) {
        System.out.println("Il " + Animal + " dice:");
    }

    public void doFly(String Animal) {
        say(Animal);
        fly();
    }

    public void doSwim(String Animal) {
        say(Animal);
        swim();
    }

    @Override
    public void fly() {
        System.out.println("Sto Volando!!!");
    }

    @Override
    public void swim() {
        System.out.println("Sto Nuotando!!!");
        ;
    }

}
