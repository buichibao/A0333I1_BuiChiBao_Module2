package ss10_list.demo.demo2.model;

public  class Teacher extends  Person {
    private  String specialist;

    public Teacher(){
        
    }
    public Teacher(String specialist) {
        this.specialist = specialist;
    }

    public Teacher(int id, String name, String dateOfBirth, String sex, String specialist) {
        super(id, name, dateOfBirth, sex);
        this.specialist = specialist;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "specialist='" + specialist + '\'' +super.toString()+
                '}';
    }
}
