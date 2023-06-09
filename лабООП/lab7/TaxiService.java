package Lab07;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Car {
    private String brand;
    private int enginePower;
    private Driver driver;
    private double price;
    private int year;

    public Car(String brand, int enginePower, Driver driver, double price, int year) {
        this.brand = brand;
        this.enginePower = enginePower;
        this.driver = driver;
        this.price = price;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

class Driver {
    private String name;
    private int age;
    private int experience;

    public Driver(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}

class TaxiServiceHelper {
    public static Car getRandomCar(Car[] cars) {
        Random random = new Random();
        int randomIndex = random.nextInt(cars.length);
        return cars[randomIndex];
    }
}

public class TaxiService {
    public static void main(String[] args) {
        Driver driver1 = new Driver("John", 30, 7);
        Driver driver2 = new Driver("Alice", 28, 4);
        Driver driver3 = new Driver("Mike", 35, 10);
        Driver driver4 = new Driver("Bil",26,5);
        Driver driver5 = new Driver("Cal",34,9);
        Driver driver6 = new Driver("Liam",35,5);
        Driver driver7 = new Driver("Noah",45,15);
        Driver driver8 = new Driver("Olivia",31,4);
        Driver driver9 = new Driver("Lucas",23,2);
        Driver driver10 = new Driver("Mia",32,12);


        Car car1 = new Car("Toyota", 150, driver1, 20000, 2018);
        Car car2 = new Car("Honda", 120, driver2, 15000, 2015);
        Car car3 = new Car("Ford", 180, driver3, 25000, 2020);
        Car car4 = new Car("BMW",230,driver4, 30000, 2022);
        Car car5 = new Car("Mercedes",180, driver5,17000,2016);
        Car car6 = new Car("Chevrolet", 110,driver6,12000,2019);
        Car car7 = new Car("Toyota", 120,driver7,15000,2017);
        Car car8 = new Car("Ford",130,driver8,18000,2019);
        Car car9 = new Car("Nissan",140,driver9,22000,2016);
        Car car10 = new Car("BMW",150,driver10,20000,2015);

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);


        for (int i = 0; i < carList.size(); i += 2) {
            Car car = carList.get(i);
            car.setEnginePower((int) (car.getEnginePower() * 1.1));
            car.setPrice(car.getPrice() * 1.05);
        }

        for (Car car : carList) {
            if (car.getDriver().getExperience() < 5 && car.getDriver().getAge() > 25) {
                car.getDriver().setExperience(car.getDriver().getExperience() + 1);
            }
        }

        Car randomCar = TaxiServiceHelper.getRandomCar(carList.toArray(new Car[0]));
        System.out.println("Автомобіль марки " + randomCar.getBrand() + " з водієм " + randomCar.getDriver().getName() + " виїхав за вами.");
        System.out.println("Водій " + randomCar.getDriver().getName() + " прибув на місце.");
    }
}