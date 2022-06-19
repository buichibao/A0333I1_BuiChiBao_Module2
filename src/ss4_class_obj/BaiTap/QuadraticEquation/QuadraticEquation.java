package ss4_class_obj.BaiTap.QuadraticEquation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double  getDiscriminant(){
        return Math.pow(b,2)-4*a*c;
    }
    public double getRoot1() {
        return -b+Math.sqrt(Math.pow(b,2)-4*a*c)/2*a;
    }
    public double getRoot2() {
        return -b-Math.sqrt(Math.pow(b,2)-4*a*c)/2*a;
    }
    public String disPlay(){
        if(this.getDiscriminant()>0){
            return "x1 = "+this.getRoot1()+" , x2 = "+this.getRoot2();
        }else if(this.getDiscriminant()==0){
            return "x1 = x2 = "+this.getRoot1();
        }else{
            return "The equation has no roots";
        }
    }

}
