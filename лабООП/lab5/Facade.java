package Lab05;

public class Facade {
    public int findMin(int num1,int num2,int num3){
        int min = num1;
        if (num2 < min){
            min = num2;
        }
        if(num3 < min){
            min = num3;
        }
        System.out.println("Найменше число з методу:" + min);
        return min;
    }
}
