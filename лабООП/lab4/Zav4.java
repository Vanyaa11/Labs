package Lab04;
import java.util.Scanner;

public class Zav4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість елементів масиву: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Введіть елементи масиву:");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Початковий масив:");
        printArray(array);

        for (int i = 0; i < size; i++) {
            if (array[i] % 2 != 0) {
                array[i] = -array[i];
            }
        }

        System.out.println("Масив після зміни знаку непарних елементів:");
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
