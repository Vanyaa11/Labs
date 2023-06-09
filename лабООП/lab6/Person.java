package Lab06;

public class Person {
    private String fullName;
    private int age;
    public Person() {
        this.fullName = "Коля";
        this.age = 0;
    }
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public void move() {
        System.out.println(fullName + " рухається.");
    }
    public void talk() {
        System.out.println(fullName + " говорить.");
    }
}