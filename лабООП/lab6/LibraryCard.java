package Lab06;

public class LibraryCard {
    private String name;
    private String surname;
    private int numBooksTaken;

    public LibraryCard(String name, String surname, int numBooksTaken) {
        this.name = name;
        this.surname = surname;
        this.numBooksTaken = numBooksTaken;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNumBooksTaken(int numBooksTaken) {
        this.numBooksTaken = numBooksTaken;
    }

    public void increaseNumBooksTaken() {
        numBooksTaken++;
    }

    public void decreaseNumBooksTaken() {
        numBooksTaken--;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getNumBooksTaken() {
        return numBooksTaken;
    }

    protected void printData() {
    }
}

