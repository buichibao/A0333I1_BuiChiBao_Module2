package ss5_access_modifier_static_get_set.BaiTap.BaiTap1;

import titv_youtube.bai32_phuong_thuc_get_set.Main;

public class Circle {
    private double radius = 1.0;
    private String color ="red";

    public  Circle(){

    }
    public Circle(double radius) {
        this.radius = radius;

    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return this.radius*this.radius* Math.PI;
    }
}
