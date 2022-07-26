package case_study.model;

public abstract class  Facility {
    private String service ;
    private double area;
    private  double cost;
    private int amount;
    private String rentalType;

    public  Facility(){

    }

    public Facility(String service, double area, double cost, int amount, String rentalType) {
        this.service = service;
        this.area = area;
        this.cost = cost;
        this.amount = amount;
        this.rentalType = rentalType;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "service='" + service + '\'' +
                ", area=" + area +
                ", cost=" + cost +
                ", amount=" + amount +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
