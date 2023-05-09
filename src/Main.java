import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] array = {{7, 3, 2}, {6, 3, 9}};
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = array[i][j] + num;
                System.out.print(array[i][j] + " ");
                summ = summ + array[i][j];
            }
            System.out.println();
        }
        System.out.println("summ: " + summ);
        System.out.println("The end");
    }
}