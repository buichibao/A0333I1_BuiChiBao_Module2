package BaiTapThemHaiTT.QuanLyCodeGym.model;

public class Teacher extends Person {
    private String specialist;

    public Teacher(){

    }

    public Teacher(String specialist) {
        this.specialist = specialist;
    }

    public Teacher(String id, String name, String dateOfBirth, String sex, String specialist) {
        super(id, name, dateOfBirth, sex);
        this.specialist = specialist;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public  String getInfor(){
        return String.format("%s,%s,%s,%s,%s\n",this.getId(),this.getName(),this.getDateOfBirth(),this.getSex(),this.getSpecialist());
    }
    @Override
    public String toString() {
        return "Teacher{ " +super.toString()+
                " specialist = " + specialist + '\'' +
                '}';
    }
}
