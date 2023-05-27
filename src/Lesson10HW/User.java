package Lesson10HW;

public class User implements Cloneable {
    private String name;
    private int age;
    private String userId;
    private Dog1 dog;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getUserId(String s) {
        return userId;
    }

    public Dog1 getDog() {
        return dog;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setDog(Dog1 dog) {
        this.dog = dog;
    }
    @Override
    public User clone() throws CloneNotSupportedException {
        User clone = (User)super.clone();
        clone.dog = (Dog1) dog.clone();
        return clone();
        return super.clone();
    }

}
