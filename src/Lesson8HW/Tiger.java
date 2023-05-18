package Lesson8HW;

public class Tiger extends Animal{
    @Override
    public void voice() {
        System.out.println("R-r-r");
    }

    @Override
    public void eat(String food) {
        if (food == "Meat"){
            System.out.println("I like eat " + food);
        } else{
            System.out.println("I do not eat it");
        }
    }
}
