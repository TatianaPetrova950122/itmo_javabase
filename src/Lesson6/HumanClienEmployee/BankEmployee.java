package Lesson6.HumanClienEmployee;

public class BankEmployee extends Human {

    private String bankName;

    public BankEmployee(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    public void info() {
        System.out.println("Банковский служащий: " + super.getName() + " " + super.getSurname() + " " + "Работает в банке: " + bankName);
    }
}