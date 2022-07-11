package ss7_acstract_interface.exrcise.exrcies1.model;

public class Rectangle implements  Resizeable {
    private double width= 4;
    private double length= 4;
    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return this.length*this.width;
    }
    public double getPerimeter(){
        return 2*(this.width+this.length);
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
    @Override
    public void resize(double percent) {
        System.out.println("Diện tích của hình chữ nhật sau khi thay đổi là: "+(getArea()+getArea()*percent));
    }
}
