
package Lab06;

public class ExtendedLibraryCard extends LibraryCard {
    private String address;
    private String phoneNumber;

    public ExtendedLibraryCard(String name, String surname, int numBooksTaken, String address, String phoneNumber) {
        super(name, surname, numBooksTaken);
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void printData() {
        super.printData();
        System.out.println("Адреса: " + address);
        System.out.println("Номер телефону: " + phoneNumber);
    }
}
