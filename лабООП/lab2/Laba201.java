package Lab02;

import java.util.Scanner;

public class Laba201 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n" + "Введіть значення a: ");
        double a = scanner.nextDouble();

        System.out.print("Введіть значення b: ");
        double b = scanner.nextDouble();

        System.out.print("Введіть значення c: ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Рішення є " + x1 + " і " + x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("Рішення є " + x);
        } else {
            System.out.println("Рівняння не має дійсних розв’язків");
        }
    }
}