package titv_youtube.bai33_phuong_thuc_toString;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day,int month,int year){
        if(0<day&&day<=31){
            this.day  = day;
        }else{
            this.day = 1;
        }
        if(0<month&&month<=12){
            this.month= month;
        }else{
            this.day = 1;
        }
        if(year>0){
            this.year = year;
        }else{
            this.day = 1;
        }
    }
    public int getDay(){
        return  this.day;
    }
    public void setDay(int newDay){
        if(newDay>0&&newDay<=31)
            this.day=newDay;
    }
    public int getMonth(){
        return  this.month;
    }
    public void setMonth(int newMonth){
        if(newMonth>0&&newMonth<=12)
            this.month=newMonth;
    }
    public int getYear(){
        return  this.year;
    }
    public void setYear(int newYear){
        if(newYear>0)
            this.year=newYear;
    }
    public String toString(){
        return this.day+"/"+this.month+"/"+this.year;
    }
}
