package Lab05;
import java.util.Scanner;

public class Zav2 {
    public void PrintTask2(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введіть друге число: ");
        int num2 = scanner.nextInt();

        System.out.print("Введіть третє число: ");
        int num3 = scanner.nextInt();

        Facade facade  = new Facade();
        int min = facade.findMin(num1,num2,num3);
    }

    }
