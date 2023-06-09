package Lab03;

public class Laba3011 {
    public static void main(String[] args) {
        String phrase = "Hello, world from Kostya!";

        // Використання циклу for
        for (int i = 0; i < 50; i++)
        //ініціалізує зі значенням 0, інтерується до 50
        {
            System.out.println(phrase);
        // Виводить фразу
        }

        // Використання циклу while
        int count = 0;// змінна яка ініціалізується зі значенням 0
        while (count < 50)
        // Збільшується на 1 кожну інтерацію
        {
            System.out.println(phrase);
        // Виводить фразу
            count++;
        }
    }
}