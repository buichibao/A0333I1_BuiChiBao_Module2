package ss15_exception_debug.exercise.model;

public class Triangle extends  Shape {
    private double a;
    private double b;
    private double c;
    public Triangle(){

    }
    public Triangle(double a, double b, double c) throws TriangleException {
        if(a<=0||b<=0||c<=0){
            throw  new TriangleException("Cạnh tam giác luôn lớn hơn 0");
        }else if(a+b<=c||b+c<=a||a+c<=b){
            throw  new TriangleException("Các cạnh không thõa mãn điều kiện để trở thành 1 tam giác");
        }else {
            this.a=a;
            this.b=b;
            this.c=c;
        }

    }

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle {"+this.a +" , "+ this.b+" , "+this.c+super.toString();
    }
}
