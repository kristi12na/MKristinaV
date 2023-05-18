package Lesson8HW;

public class Dog extends Animal{
    @Override
    public void voice() {
        System.out.println("Bow-wow");
    }

    @Override
    public void eat(String food) {
        if (food == "Bone"){
            System.out.println("I like eat " + food);
        } else{
            System.out.println("I do not eat it");
        }
    }
}
