package Lesson10HW;

public class Main {
    public static void main(String[] args) {
          SystemUser user1 = new SystemUser();
          user1.setName("Vlad");
          user1.setAge(24);
          user1.setAddress("Polevaia 64");

          SystemUser user2 = new SystemUser();
          user2.setName("Vlad");
          user2.setAge(24);
          user2.setAddress("Polevaia 64");

          SystemUser user3 = new SystemUser();
          user3.setName("Roma");
          user3.setAge(24);
          user3.setAddress("Gaidara 34");

          SystemUser user4 = new SystemUser();
          user4.setName("Vlad");
          user4.setAge(27);
          user4.setAddress("Janki 80");

          System.out.println(user1.equals(user2));
          System.out.println(user2.equals(user3));
          System.out.println(user1.equals(user4));




    }
}
