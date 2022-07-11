package ss7_acstract_interface.exrcise.exrcies1.model;

public class Circle implements  Resizeable{
    private double radius= 2;
    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
    public double getPerimeter(){
        return 2*Math.PI*this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public void resize(double percent) {
        System.out.println("Diện tích của hình tròn sau khi thay đổi kích thước là "+(getArea()+(getArea()*percent)));
    }
}
