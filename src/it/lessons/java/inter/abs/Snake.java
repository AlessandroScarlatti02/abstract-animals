package it.lessons.java.inter.abs;

public class Snake extends Animal {

    @Override
    public void towards() {
        System.out.println("Il verso del serpente è: \"tsss\"");
    }

    @Override
    public void eat() {
        System.out.println("Il serpente mangia: carne, piccoli e medi animali");
    }

}
