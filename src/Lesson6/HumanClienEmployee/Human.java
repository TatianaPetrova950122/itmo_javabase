package Lesson6.HumanClienEmployee;

public abstract class Human {
    private String name;
    private String surname;

    public String getName () {
        return name;
    }
    public String getSurname () {
        return surname;
    }

    abstract public void info ();

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}