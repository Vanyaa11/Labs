package Lab02;

import java.util.Scanner;

public class Laba202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть значення x: ");
        double x = scanner.nextDouble();

        System.out.print("Введіть значення y: ");
        double y = scanner.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("Точка в квадранті I");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка в квадранті II");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка в квадранті III");
        } else if (x > 0 && y < 0) {
            System.out.println("Точка в квадранті IV");
        } else {
            System.out.println("Точка в початку координат");
        }
    }
}
