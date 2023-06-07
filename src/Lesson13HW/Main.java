package Lesson13HW;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        Login login1 = new Login();
      try {
         login1.valuesParameter("Kristina","Tina123kristi","Tina123kristi");
      } catch (WrongLoginException | WrongPasswordException e){
          System.out.println("Some Wrong Login Excepyion");
      }
        System.out.println(login1);
    }
}
