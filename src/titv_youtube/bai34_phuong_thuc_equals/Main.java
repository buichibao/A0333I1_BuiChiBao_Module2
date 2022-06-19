package titv_youtube.bai34_phuong_thuc_equals;

public class Main {
    public static void main(String[] args) {
        MyDate date = new MyDate(22,2,2001);
        MyDate date2 = new MyDate(4,4,1994);
        MyDate date3 = new MyDate(22,2,2001);

        //phương thức equals dùng để so sánh giá trị giữa 2 đối tượng ,dùng để so sanh kiểu đối tượng kiểu dấu "==" dùng
        //để so sánh kiểu nguyên thủy
        System.out.println("So sánh date với date2 có kết quả là : " + date.equals(date2));
        System.out.println("So sánh date với date3 có kết quả là : " + date.equals(date3));
    }
}
