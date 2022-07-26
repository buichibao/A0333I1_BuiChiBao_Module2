package BaiTapThemHaiTT.QuanLyCodeGym.model;

public class Student  extends  Person implements Comparable<Student>{
    private double score;
    private String className;

    public Student(){

    }



    public Student(double score, String className) {
        this.score = score;
        this.className = className;
    }

    public Student(String id, String name, String dateOfBirth, String sex, double score, String className) {
        super(id, name, dateOfBirth, sex);
        this.score = score;
        this.className = className;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String getinFor() {
        return String.format("%s,%s,%s,%s,%s,%s\n",this.getId(),this.getName(),this.getDateOfBirth(),this.getSex(),this.getScore(),this.getClassName());
    }

    @Override
    public String toString() {
        return "Student{ " +super.toString() +
                " score = " + score +
                ", className = " + className +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        String []name = new String[0];
        for (int i = 0; i <getName().length() ; i++) {
              name=getName().split(" ");
        }
        return name[name.length-1].compareTo(o.getName());
    }
}
