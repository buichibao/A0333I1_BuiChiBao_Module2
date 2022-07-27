package case_study.model;

public class Employee extends Person{
      private String idEmployee;
      private String educationLevel;
      private String location;
      private double salary;

      public Employee(){

      }

    public Employee(String idEmployee, String educationLevel, String location, double salary) {
        this.idEmployee = idEmployee;
        this.educationLevel = educationLevel;
        this.location = location;
        this.salary = salary;
    }

    public Employee(String name, String dateOfBirth, String sex, int idNumber, String numberPhone, String email, String idEmployee, String educationLevel, String location, double salary) {
        super(name, dateOfBirth, sex, idNumber, numberPhone, email);
        this.idEmployee = idEmployee;
        this.educationLevel = educationLevel;
        this.location = location;
        this.salary = salary;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                "idEmployee='" + idEmployee + '\'' +
                ", educationLevel='" + educationLevel + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                '}';
    }
}
