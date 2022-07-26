package case_study.model;

public class Room extends Facility {
    private String freeService;

    public Room(){

    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String service, double area, double cost, int amount, String rentalType, String freeService) {
        super(service, area, cost, amount, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
