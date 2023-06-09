package Lab04;
public class Zav2 {
    public static void main(String[] args) {
        int[] arr = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};

        // перебираємо масив циклом while
        System.out.println("Перебираємо масив циклом while:");
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();

        // перебираємо масив циклом for
        System.out.println("Перебираємо масив циклом for:");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();

        // перебираємо масив циклом while та виводимо числа тільки з непарним індексом
        System.out.println("Виводимо числа тільки з непарним індексом:");
        int k = 1;
        while (k < arr.length) {
            System.out.print(arr[k] + " ");
            k += 2;
        }
        System.out.println();

        // перебираємо масив циклом for та виводимо числа тільки з парним індексом
        System.out.println("Виводимо числа тільки з парним індексом:");
        for (int l = 0; l < arr.length; l += 2) {
            System.out.print(arr[l] + " ");
        }
        System.out.println();

        // виводимо масив в зворотньому порядку
        System.out.println("Масив в зворотньому порядку:");
        for (int m = arr.length - 1; m >= 0; m--) {
            System.out.print(arr[m] + " ");
        }
        System.out.println();
    }
}