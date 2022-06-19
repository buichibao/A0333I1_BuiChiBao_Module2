package titv_youtube.bai32_phuong_thuc_get_set;

public class Main {
    public static void main(String[] args) {
        MyDate date = new MyDate(-1,3,2001);
        //Nếu các thuộc tính để public thì ở đây chỉ cần date.day =21; thì có thể thay đổi được nên bắt buộc phải private
        int day = date.getDay();
        System.out.println("Day = "+day);//vì truyền vào giá trọ bằng -1 không thỏa mãn nên bị reset về 1
        date.setDay(31);
        day = date.getDay();
        System.out.println("Day = "+day);
        //các hàm get-set của day giống với month va year
    }
}
