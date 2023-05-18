package Lesson8HW;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Tiger();
        Animal animal3 = new Rabbit();

        animal1.voice();
        animal2.voice();
        animal3.voice();

        animal1.eat("Bone");
        animal2.eat("Meat");
        animal3.eat("Grass");


    }
}
