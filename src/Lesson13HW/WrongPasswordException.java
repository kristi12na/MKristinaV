package Lesson13HW;

public class WrongPasswordException extends Exception{
    private String detail;

    public WrongPasswordException(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "WrongPasswordException{" +
                "detail='" + detail + '\'' +
                '}';
    }
}
