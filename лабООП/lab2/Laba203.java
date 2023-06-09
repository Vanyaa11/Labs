package Lab02;

import java.util.Scanner;

public class Laba203 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число: ");
        int number = scanner.nextInt();

        if (number >= 10 && number <= 99) {
            if (number % 2 == 0) {
                System.out.println("Число парне і двозначне");
            } else {
                System.out.println("Число непарне і двозначне");
            }
        } else {
            System.out.println("Число не двозначне");
        }
    }
}
