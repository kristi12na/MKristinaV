package Lesson13HW;

public class Login {
    String login;
    String password;
    String confirmPassword;

    public static boolean valuesParameter(String login, String password, String confirmPassword) {
        if ( login > 20){
            throw new WrongLoginException();
        }
        if (password == confirmPassword || password > 20) {
            throw new WrongPasswordException();
        }
    }
}
