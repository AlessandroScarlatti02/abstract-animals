package it.lessons.java.inter.abs;

public class Dog extends Animal {

    public Dog() {
        super();
    };

    @Override
    public void towards() {
        System.out.println("Il verso del cane è: \"woof\"");
    }

    @Override
    public void eat() {
        System.out.println("Il cane mangia: crocchette, carne");
    }
}
