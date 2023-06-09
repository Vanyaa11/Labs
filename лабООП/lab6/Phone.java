package Lab06;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this(number, model, 0);
    }

    public Phone() {
        this("", "", 0);
    }

    public void receiveCall(String callerName) {
        System.out.println("Дзвонить " + callerName);
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Дзвонить " + callerName + " з номера " + callerNumber);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... numbers) {
        for (String number : numbers) {
            System.out.println("Надіслано повідомлення на номер " + number);
        }

    }
}
