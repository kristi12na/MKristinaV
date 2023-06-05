package Lesson12HW;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String s = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\d{4}-\\d{4}-\\d{2}||\\w+@\\w+.\\w{2,3} ||\\+\\(\\d{2}\\)\\d{7}");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group() + " ");
        }
    }
}
