package Lab03;

import java.util.Scanner;

public class Lab30152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // створює новий об'єкт класу Scanner, який буде використовуватися для отримання введення від користувача з консолі.
        System.out.print("Введіть нижню межу діапазону: ");
        //виводить запит на введення нижньої межі діапазону.
        double lowerBound = scanner.nextDouble();
        // отримує значення нижньої межі діапазону, яку вводить користувач.
        System.out.print("Введіть верхню межу діапазону: ");
        //виводить запит на введення верхньої межі діапазону.
        double upperBound = scanner.nextDouble();
        //отримує значення верхньої межі діапазону, яку вводить користувач.
        double step = 0.2;
        //Зміщення аргументу функції в кожній інтерації циклу
        int count = 0;
        //ініціалізує змінну count зі значенням 0, яке використовується для підрахунку кількості значень функції, які потрапляють в заданий діапазон.
        for (double x = -2.0; x <= 2.0; x += step)
        //цикл for, в якому змінна x починається з -2.0, закінчується на 2.0 та збільшується на step після кожної ітерації циклу.
        {
            double y = 2 * x * Math.sin(x) - Math.cos(x);
        //обчислюємо значення функції для поточного значення x.
            if (y >= lowerBound && y <= upperBound) {
                count++;
            }

            System.out.printf("f(%.1f) = %.4f%n", x, y);
        }

        if (count == 0)
            //Якщо count дорівнює 0, то виводиться повідомлення про те, що в діапазоні не знайдено жодного значення.
            {
            System.out.println("У діапазоні немає значень.");
        } else
        //виводяться значення функції для кожного значення аргументу x, яке було обчислено у циклі
        {
            System.out.printf("У діапазоні %d значень.%n", count);
        }
    }
}