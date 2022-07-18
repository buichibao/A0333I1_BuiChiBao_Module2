package ss10_list.demo.demo1.model;

public class Student extends Person{
    private double point;
    private String nameSchool;


    public Student(int id, String name, String dateOfBirth, String sex, String classed, double score){
        super(id, name, dateOfBirth);
        this.point = point;
        this.nameSchool = nameSchool;
    }
    public Student(double point, String nameSchool) {
        this.point = point;
        this.nameSchool = nameSchool;
    }


    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public String getNameSchool() {
        return nameSchool;
    }

    public void setNameSchool(String nameSchool) {
        this.nameSchool = nameSchool;
    }

    @Override
    public String toString() {
        return "Student{" +
                "point=" + point +
                ", nameSchool='" + nameSchool + '\'' +super.toString()+
                '}';
    }
}
