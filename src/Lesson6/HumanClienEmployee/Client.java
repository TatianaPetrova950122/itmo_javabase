package Lesson6.HumanClienEmployee;

public class Client extends Human {

    private String bankName;

    public Client(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    public void info() {
        System.out.println("Клиент: " + super.getName() + " " + super.getSurname() + " " + "Счет в банке: " + bankName);
    }
}