package Lab06;

public class Main {
    public static void main(String[] args ){
                System.out.println("\nTask 1: ");
                Person person1 = new Person();
                person1.move();
                person1.talk();
                Person person2 = new Person("Олег", 30);
                person2.move();
                person2.talk();

        Phone phone1 = new Phone("099 578 7845", "Iphone 12 Pro", 0.2);
        Phone phone2 = new Phone("093 745 978 ", "iPhone 12");
        Phone phone3 = new Phone();

        System.out.println("\nTask 2: ");
        System.out.println("Номер телефону: " + phone1.getNumber());
        phone1.receiveCall("Марія");
        phone1.receiveCall("Микола", "099 567 4857");
        phone1.sendMessage(phone2.getNumber(), phone3.getNumber());
        System.out.println("Номер телефону: " + phone2.getNumber());
        phone2.receiveCall("Назар");
        phone2.sendMessage(phone1.getNumber(), phone3.getNumber());
        System.out.println("Номер телефону: " + phone3.getNumber());
        phone3.receiveCall("Поліна");
        phone3.sendMessage(phone1.getNumber(), phone2.getNumber());

        System.out.println("\n Task 3: ");
        Shape shape = new Shape(2);
        double volume = shape.getVolume();
        System.out.println("Volume: " + volume);

        System.out.println("\n Task4: ");
        Sedan sedan = new Sedan("BMW", "чорний", 220);
        Truck truck = new Truck("Volvo", "сірий", 180);
        sedan.gas();
        sedan.brake();
        truck.gas();
        truck.brake();

        System.out.println("\nTask 5: ");
        LibraryCard card1 = new LibraryCard("Назар", "Максимів", 3);
        System.out.println("Ім'я: " + card1.getName());
        System.out.println("Прізвище: " + card1.getSurname());
        System.out.println("Кількість взятих книг: " + card1.getNumBooksTaken());

        card1.increaseNumBooksTaken();
        System.out.println("Кількість книг, взятих після збільшення: " + card1.getNumBooksTaken());

        card1.decreaseNumBooksTaken();
        System.out.println("Кількість книг, взятих після зменшення: " + card1.getNumBooksTaken());

        card1.setName("Поліна");
        card1.setSurname("Максимівна");
        System.out.println("Оновлені ім'я та прізвище: " + card1.getName() + " " + card1.getSurname());
        ExtendedLibraryCard card = new ExtendedLibraryCard("Назар", "Максимів", 3, "Степана Бандери", "099 567 4857");
        card.printData();
    }
}





