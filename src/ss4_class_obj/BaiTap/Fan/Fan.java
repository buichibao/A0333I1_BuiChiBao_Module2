package ss4_class_obj.BaiTap.Fan;

public class Fan {
    private static final int SLOW = 1;
    private static final int MEDIUM= 2;
    private static final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String check(){
        String trangThai ="";
        switch (getSpeed()){
            case 1:
                trangThai+="SLOW";
                break;
            case 2:
                trangThai+="MEDIUM";
                break;
            case 3:
                trangThai+="FAST";
                break;
        }
        return  trangThai;
    }
    public String toString(){
        if(this.isOn()==true){
            return "Fan is on "+" speed = "+check()+" radius = "+this.radius+" , color = "+this.color;
        }else{
            return "Fan is off"+" radius = "+this.radius+" ,color = "+this.color;
        }
    }
}
