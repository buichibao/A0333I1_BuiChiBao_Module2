package ss10_list.demo.demo2.model;

public class Student extends  Person {
    private String classed;
    private double score;

    public Student(){

    }

    public Student(String classed, double score) {
        this.classed = classed;
        this.score = score;
    }

    public Student(int id, String name, String dateOfBirth, String sex, String classed, double score) {
        super(id, name, dateOfBirth, sex);
        this.classed = classed;
        this.score = score;
    }

    public String getClassed() {
        return classed;
    }

    public void setClassed(String classed) {
        this.classed = classed;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "classed='" + classed + '\'' +
                ", score=" + score + super.toString()+
                '}';
    }
}

