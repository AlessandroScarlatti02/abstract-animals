package it.lessons.java.inter.abs;

public class Seagull extends Animal {

    @Override
    public void towards() {
        System.out.println("Il verso del gabbiano è: \"cocài\"");
    }

    @Override
    public void eat() {
        System.out.println("Il Gabbiano mangia: Pesce, Insetti, ecc..");
    }

}
