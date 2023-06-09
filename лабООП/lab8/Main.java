package Lab08;

import java.io.*;
import java.util.Scanner;
import java.util.Random;;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть початок діапазону:");
        int b1 = sc.nextInt();
        System.out.println("Введіть кінець діапазону:");
        int b2 =sc.nextInt();


        System.out.println("Введіть назву файлу: ");
        String filename = sc.next();

        File file = new File(filename);

        try {
            if(!file.exists()){
                file.createNewFile();
            }
            FileWriter writer = new FileWriter(file);
            int count = 10;
            for(int i = 0; i<count; i++){
                int rand = new Random().nextInt(b2-b1+1)+b1;
                writer.write(rand+ "\n");
            }
            writer.close();
            System.out.println("Випадкові числа, збережені у файлі: " + filename);

        }catch (IOException e) {
            System.out.println("Помилка створення або запису у файл: " + e.getMessage());
        }


        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Помилка читання файлу: " + e.getMessage());
        }
    }

}

