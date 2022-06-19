package titv_youtube;

public class bai30_xay_dung_lop_va_contractor1 {

    public static void main(String[] args) {
        MyDate date = new MyDate(22, 2, 2001);
        date.printDate();
    }

    public static class MyDate {
        private int day;
        private int month;
        private int year;

        public MyDate(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public void printDay() {
            System.out.println("Day " + this.day);
        }

        public void printMonth() {
            System.out.println("Month " + this.month);
        }

        public void printYear() {
            System.out.println("Year " + this.year);
        }

        public void printDate() {
            System.out.println("Date " + this.day + "/" + this.month + "/" + this.year);
        }

    }
}