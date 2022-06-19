package titv_youtube.bai37_quan_ly_sinh_vien;

public class NgaySinh {
    private int day;
    private int month;
    private int year;

    public NgaySinh(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        NgaySinh other = (NgaySinh) obj;
        if (year != other.year)
            return false;
        if (day != other.day)
            return false;
        if (day != other.day)
            return false;
        return true;
    }
}
