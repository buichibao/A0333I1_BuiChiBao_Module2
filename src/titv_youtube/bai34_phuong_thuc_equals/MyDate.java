package titv_youtube.bai34_phuong_thuc_equals;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day,int month,int year){
        if(0<day&&day<=31){
            this.day = day;
        }else{
            this.day=1;
        }
        if(0<month&&month<=12){
            this.month =month;
        }else{
            this.month=1;
        }
        if(year>0){
            this.year = year;
        }else{
            this.year=1;
        }
    }
    public int getDay(){
        return this.day;
    }
    public void setDay(int newDay){
        if(newDay>0&&newDay<=31)
            this.day=newDay;
    }
    public int getMonth(){
        return this.month;
    }
    public void setMonth(int newMonth){
        if(newMonth>0&&newMonth<=12)
            this.month=newMonth;
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int newYear){
        if(newYear>0&&newYear<=31)
            this.day=newYear;
    }
    public boolean equals(Object obj){
        //this là đại diện cho đối tượng hiện tại

        if(this==obj)//so sánh  chính nó
            return true;
        if(obj==null)//so sánh với 1 đối tượng không tồn tại
            return false;
        if(this.getClass()!=obj.getClass())//so sánh lớp của đối tượng VD: lớp A so với lớp B
            return false;
        MyDate other = (MyDate)obj;//ép kiểu
        if(this.day!=other.day)
            return false;
        if(this.month!=other.month)
            return false;
        if(this.year!=other.year)
            return false;
        return true;

    }
}
