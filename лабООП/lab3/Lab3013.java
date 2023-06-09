package Lab03;

public class Lab3013 {
    public static void main(String[] args) {
        int hours = 0;// змінна
        int minutes = 0;// змінна

        while (hours < 3)
        // За допомогою while, перевіряємо чи не перевищили ми 3 години
        {
            System.out.printf("%d h %d min\n", hours, minutes);
        //Виводим рядок, що містить значення годин та хвилин

            minutes++;
        // Збільшує minutes на 1
            if (minutes == 60)
        // Якщо minutes дорівнює 60, то збільшуємо значення hours на 1, і обнуляєм значення minutes
            {
                hours++;
                minutes = 0;
            }
        }
    }
}