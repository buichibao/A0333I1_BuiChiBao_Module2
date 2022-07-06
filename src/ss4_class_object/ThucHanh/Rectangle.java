package ss4_class_object.ThucHanh;

public class Rectangle {
    double width;
    double height;

    public Rectangle(){

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return 2*(this.height+this.width);
    }
    public String disPlay(){
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
