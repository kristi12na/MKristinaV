package Lesson10HW;

public class Dog1 implements Cloneable {
    private String name;
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
