package Lesson8HW;

public class Rabbit extends Animal{
    @Override
    public void voice() {
        System.out.println("Peep");
    }
    @Override
    public void eat(String food) {
        if (food == "Grass"){
            System.out.println("I like eat " + food);
        } else{
            System.out.println("I do not eat it");
        }
    }
}
