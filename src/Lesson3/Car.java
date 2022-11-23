package Lesson3;

public class Car {

    private String color;
    private String title;
    private int weight;

    public Car(String color) {
        this.color = color;
    }
    public Car(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }
    public Car() {
         }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getWeight(int weight) {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void info (){
        System.out.println("цвет - " + color);
        System.out.println("название - " + title);
        System.out.println("вес - " + weight);

    }

    public static void main(String[] args) {
        Car car1 = new Car("red");
        Car car2 = new Car("white", 12);
        car1.info();
        car2.info();
        }
}
