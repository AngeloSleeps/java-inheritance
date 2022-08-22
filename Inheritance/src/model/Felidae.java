package model;

public class Felidae extends Animal{
    public Felidae(int age, float weight) {
        super(age, weight);
    }

    public void makeSound() {
        System.out.println("Meow meow meow nyaaaah~");
    }
}
