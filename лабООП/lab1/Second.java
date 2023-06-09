package Lab01;

public class Second {
    public static void main(String[] args) {
        String phrase = "The beautiful dog Jessie ran after the cat but found food";
        int count = 50;

        for (int i = 0; i < count; i++) {
            System.out.println(phrase);
        }

        int i = 0;
        while (i < count) {
            System.out.println(phrase);
            i++;
        }
    }
}
