package Lab05;
import java.util.Scanner;

public class Zav3 {
    public void PrintTask3() {
        Scanner scanner = new Scanner(System.in);

        // Заповнення масиву
        System.out.print("Введіть кількість елементів масиву: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Вивід масиву
        System.out.println("Масив:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}