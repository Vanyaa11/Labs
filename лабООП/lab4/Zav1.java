package Lab04;

public class Zav1 {
    public static void main(String[] args) {
        // Створюємо масив розміром 100
        int[] arr = new int[100];

        // Заповнюємо масив 50 парними числами
        for (int i = 0; i < 50; i++) {
            arr[i] = i * 2;
        }

        // Заповнюємо масив 50 непарними числами
        for (int i = 50; i < 100; i++) {
            arr[i] = i * 2 + 1;
        }

        // Виводимо масив на екран
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
