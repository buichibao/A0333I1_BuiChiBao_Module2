package on_tap.QuanLyGianVienVaHocSinh.model;

public class Student extends Person{
    private String className;
    private String score;

    public Student(){

    }

    @Override
    public String inFor() {
        return String.format("%d,%s,%s,%s,%s,%s\n",this.getId(),this.getName(),this.getDateOfBirth(),this.getSex(),this.getClassName(),this.getScore());
    }

    public Student(String className, String score) {
        this.className = className;
        this.score = score;
    }

    public Student(int id, String name, String dateOfBirth, String sex, String className, String score) {
        super(id, name, dateOfBirth, sex);
        this.className = className;
        this.score = score;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString()+
                " className='" + className + '\'' +
                ", score='" + score + '\'' +
                '}';
    }
}
