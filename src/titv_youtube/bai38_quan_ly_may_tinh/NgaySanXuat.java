package titv_youtube.bai38_quan_ly_may_tinh;

public class NgaySanXuat {
    private int day;
    private int month;
    private int year;

    public NgaySanXuat(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return this.month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return this.day;
    }
}
