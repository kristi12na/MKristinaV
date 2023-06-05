package Lesson12HW;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String s = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\b[A-Z]{2,6}");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
    }
}

