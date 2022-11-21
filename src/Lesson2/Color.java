package Lesson2;

public enum Color {

    BLACK("черный"),
    WHITE("белый"),
    BEIGE("бежевый");

    private final  String description;

    Color(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
