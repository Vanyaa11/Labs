package Lab04;
import java.util.Scanner;

public class Zav3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість елементів масиву: ");
        int size = scanner.nextInt();

        double[] array = new double[size];

        System.out.println("Введіть елементи масиву:");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }

        double sum = 0.0;

        for (int i = 0; i < size; i++) {
            sum += array[i];
        }

        System.out.println("Сума елементів масиву: " + sum);
    }
}