package Lab01;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть значення x: ");
        double x = scanner.nextDouble();

        double result;
        if (x < 0) {
            result = Math.pow(Math.sin(x), 3) - Math.pow(Math.cos(x), 3) + 1;
        } else if (x >= 0 && x <= 2) {
            result = Math.log(x + 2);
        } else {
            result = Math.sqrt(Math.pow(x, 2) - Math.pow(x, 3));
        }

        System.out.println("f(x) = " + result);
    }
}