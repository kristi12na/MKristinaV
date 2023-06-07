package Lesson13HW;

public class Login {
    String login;
    String password;
    String confirmPassword;

    public static boolean valuesParameter(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if ( login.length() >20|| login.contains(" ")){
            throw new WrongLoginException();
        }
        if (password != confirmPassword || password.length() > 20|| password.contains(" ")||password.matches("\\D")) {
            throw new WrongPasswordException("");
        }
        return true;
    }
}
