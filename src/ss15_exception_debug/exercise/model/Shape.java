package ss15_exception_debug.exercise.model;

public abstract class Shape {
    private String color ="red";

    public Shape() {

    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return
                " , color='" + color ;
    }
}
