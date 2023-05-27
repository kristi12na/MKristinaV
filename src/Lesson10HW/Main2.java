package Lesson10HW;

import Lesson10.Dog;

public class Main2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user1 = new User();
        user1.setName("Artur");
        user1.setAge(32);
        user1.getUserId("id"+"12345");
        user1.setDog(new Dog1());
        user1.getDog().setName("Derbi");

        User user2 = new User();
        user2.setName("Dima");
        user2.setAge(24);
        user2.getUserId("id"+"54321");
        user1.setDog(new Dog1());
        user1.getDog().setName("Ronda");

        User user3 = new User();
        user3.setName("Vlad");
        user3.setAge(21);
        user3.getUserId("id"+"74563");
        user1.setDog(new Dog1());
        user1.getDog().setName("Nord");

        User newUser = (User) user1.clone();
        System.out.println(user1.getName() +" "+ user1.getAge());
        System.out.println(newUser.getName() +" "+ newUser.getAge());

        User newUser1 = (User) user2.clone();
        System.out.println(user2.getName() +" "+ user2.getAge());
        System.out.println(newUser1.getName() +" "+ newUser1.getAge());

        User newUser2 = (User) user3.clone();
        System.out.println(user3.getName() +" "+ user3.getAge());
        System.out.println(newUser2.getName() +" "+ newUser2.getAge());




    }
}
