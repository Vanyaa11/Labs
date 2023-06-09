package Lab01;

public class Third {
    public static void main(String args[]) {
        int id = 1;
        int age = 20;
        String name = "Андрій";
        String surname = "Лавер";
        double weight = 75.3;
        double height = 1.69;

        int id1 = 2;
        int age1 = 18;
        String name1 = "Назар";
        String surname1 = "Боруто";
        double weight1 = 66.8;
        double height1 = 1.78;

        int id2 = 3;
        int age2 = 43;
        String name2 = "Володимир";
        String surname2 = "Зеленський";
        double weight2 = 65.0;
        double height2 = 1.67;

        int id3 = 4;
        int age3 = 19;
        String name3 = "Саске";
        String surname3 = "Учіха";
        double weight3 = 60.7;
        double height3 = 1.78;

        int id4 = 5;
        int age4 = 16;
        String name4 = "Наруто";
        String surname4 = "Удзумакі";
        double weight4 = 68.2;
        double height4 = 1.83;

        int id5 = 6;
        int age5 = 19;
        String name5 = "Лідія";
        String surname5 = "Ярема";
        double weight5 = 62.4;
        double height5 = 1.74;

        int id6 = 7;
        int age6 = 17;
        String name6 = "Євген";
        String surname6 = "Сєрий";
        double weight6 = 60.0;
        double height6 = 1.76;

        int id7 = 8;
        int age7 = 18;
        String name7 = "Сергій";
        String surname7 = "Звенигора";
        double weight7 = 61.3;
        double height7 = 1.87;

        int id8 = 9;
        int age8 = 19;
        String name8 = "Ілля";
        String surname8 = "Іллін";
        double weight8 = 76.8;
        double height8 = 1.72;

        int id9 = 10;
        int age9 = 17;
        String name9 = "Климентій";
        String surname9 = "Косовий";
        double weight9 = 65.0;
        double height9 = 1.76;

        int sumage = age + age1 + age2 + age3 + age4 + age5 + age6 + age7 + age8 + age9;

        double sumweight = weight + weight1 + weight2 + weight3 + weight4 + weight5 + weight6 + weight7 + weight8 + weight9;

        double sumheight = height + height1 + height2 + height3 + height4 + height5 + height6 + height7 + height8 + height9;

        System.out.printf("Сума їх віку = %d років\n Сума їх ваги = %.2f кг\n Сума їх зросту = %.2f\n",sumage, sumweight, sumheight);
    }
}