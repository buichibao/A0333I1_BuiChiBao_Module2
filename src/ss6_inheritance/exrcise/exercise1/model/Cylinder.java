package ss6_inheritance.exrcise.exercise1.model;

public class Cylinder extends Circle {
   private  double height;

    public  Cylinder(){

    }
    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(double height){
        return super.getArea()*height;
    }
    @Override
    public String toString() {
        return "Cylinder is has " +
                "height=" + height +super.toString();
    }
}
