package Lab01;

public class First {public static void main (String args[]){
    int a = 100;
    int b = 90;
    int c = 80;
    int d = 70;
    int e = 60;
    int f = 50;
    int g = 40;
    int h = 30;
    int i = 20;
    int j = 10;

    int p = a + b + c + d + e + f + g + h + i + j;
    int o = a - b - c - d - e - f - g - h - i - j;
    int x = a * b * c * d * e * f * g * h * i * j;
    float y = a / b / c / d / e / f / g / h / i / j;

    System.out.printf("Сума = %d\n Різниця = %d\n Добуток = %d\n Частка = %.20f\n",p, o, x,y);
}
}