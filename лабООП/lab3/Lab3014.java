package Lab03;

public class Lab3014 {
    public static void main(String[] args){

        for (int h = 0; h < 3; h++)
        //Змінюємо години від 0 до 2
        {

            for (int m = 0; m < 60; m++)
            //Змінюємо хвилини від 0 до 59
            {

                for (int s = 0; s < 60; s++)
                //Змінюємо секунди від 0 до 59
                {

                    System.out.printf("%d h %d min %d sec%n", h, m, s);
                // Виводим години,хвилини та секунди
                }
            }
        }
    }
}
