package titv_youtube.bai33_phuong_thuc_toString;

public class Main {
    public static void main(String[] args) {
        MyDate date = new MyDate(22,2,2001);
        MyDate date2 = new MyDate(28,12,1973);
        MyDate date3 = new MyDate(18,03,1972);

        //Nếu chưa khai báo hàm totString nếu sout(date) sẽ ra địa chỉ chỉ của date
        //System.out.println(date);=MyDate@1b6d3586
        //Khai báo toString rồi thì sẽ ra định dạng của phương thức toString khi gọi date
        System.out.println(date);
    }
}
