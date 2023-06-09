package Lab03;

public class Lab3012 {
    public static void main(String[] args){

        for (int h = 0; h <= 2; h++)
        //Зовнішній цикл for, що пище всі години
        {
            for (int m = 0; m < 60; m++)
        //Вкладений цикл,щоб перебрати всі можливі значення хвилин
            {
                System.out.printf("%d h %d min\n", h, m);
        //Виводить рядок, що містить значення години та хвилини
            }
        }
    }
}
