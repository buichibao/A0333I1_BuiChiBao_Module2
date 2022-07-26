package case_study.model;

public class Villa extends Facility {
    private String roomStandard;
    private double swimmingPoolArea;
    private int numberOfFloors;

    public Villa(){

    }

    public Villa(String roomStandard, double swimmingPoolArea, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String service, double area, double cost, int amount, String rentalType, String roomStandard, double swimmingPoolArea, int numberOfFloors) {
        super(service, area, cost, amount, rentalType);
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(double swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", swimmingPoolArea=" + swimmingPoolArea +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
