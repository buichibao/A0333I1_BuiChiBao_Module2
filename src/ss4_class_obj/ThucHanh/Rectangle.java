package ss4_class_obj.ThucHanh;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public double getArea (){
        return this.height*this.width;
    }
    public double getPerimeter(){
        return 2*(this.height*this.width);
    }

    public String disPlay() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
