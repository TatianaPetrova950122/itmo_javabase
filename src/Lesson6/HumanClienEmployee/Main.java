package Lesson6.HumanClienEmployee;

public class Main {
    public static void main(String[] args) {
        BankEmployee employee1 = new BankEmployee("Mick", "Sun", "Table");
        Client client1 = new Client("Dude", "Strange", "Village");
        employee1.info();
        client1.info();
    }
}
