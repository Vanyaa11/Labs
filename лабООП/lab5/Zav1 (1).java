package Lab05;

import java.util.Scanner;

public class Zav1 {
    public void printTask1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть  першу основу: ");
        double base1 = scanner.nextDouble();

        System.out.println("Введіть  другу основу: ");
        double base2 =scanner.nextDouble();

        System.out.println("Введіть висоту: ");
        double height = scanner.nextDouble();

        TrapezoidArea trapezoid = new TrapezoidArea();
        double area = trapezoid.getTrapezoidArea(base1 , base2, height);
        System.out.println("\n Task 1:");
        System.out.println("Площа трапеції: " + area +  "\n основа 1 =" + base1 + " \nоснова 2 =" + base2 + " \nвисота = " + height);

    }
}
