package Lab05;

import java.util.Scanner;

public class Zav4 {
    public void PrintTask4() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість елементів масиву: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Введіть " + n + " елементів масиву: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = findMax(arr);

        System.out.println("Найбільше число: " + max);
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}