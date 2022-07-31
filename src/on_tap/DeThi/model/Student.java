package on_tap.DeThi.model;

public class Student extends Person implements Comparable<Student>{
    private String className;
    private double score;


    public Student(){

    }

    public Student(String className, double score) {
        this.className = className;
        this.score = score;
    }

    public Student(int id, String name, String dateOfBirth, String sex, String className, double score) {
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{ " + super.toString()+
                " className ='" + className + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public String getInfor() {
        return String.format("%d,%s,%s,%s,%s,%f\n",this.getId(),this.getName(),this.getDateOfBirth(),this.getSex(),
                this.getClassName(),this.getScore());
    }

    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }
}
