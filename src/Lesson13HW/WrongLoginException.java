package Lesson13HW;

public class WrongLoginException extends Exception{
    private String detail;

    public WrongLoginException(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "WrongLoginException{" +
                "detail='" + detail + '\'' +
                '}';
    }
}
