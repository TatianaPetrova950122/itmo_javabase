package Lesson3;

public class Tree {

    String title;
    int age;
    Boolean alive;



    public Tree (String title, int age) {
        this.title = title;
        this.age = age;
    }

    public Tree (String title, int age, Boolean alive) {
        this.title = title;
        this.age = age;
        this.alive = alive;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getAlive() {
        return alive;
    }

    public void setAlive(Boolean alive) {
        this.alive = alive;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "title='" + title + '\'' +
                ", age=" + age +
                ", alive=" + alive +
                '}';
    }

}
