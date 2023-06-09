package Lab06;

import java.util.Scanner;

abstract class Car {
    String model;
    String color;
    int maxSpeed;

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void gas() {
        System.out.println("Газ");
    }

    public abstract void brake();
}