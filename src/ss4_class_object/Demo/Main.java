package ss4_class_object.Demo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Studen[] studens = new Studen[2];
        //Khi sử dụng 1 đối tượng có giá trị null mà truy cập đến thuộc tính hoặc phương thức thì bị lỗi
        //NullPointerException
        for (int i = 0; i <studens.length ; i++) {
            studens[i]= new Studen();
            System.out.printf("------Nhập thông tin sinh viên %d------",i+1);
            System.out.println();
            System.out.print("Nhập tên sinh viên ");
            studens[i].name=sc.nextLine();
            System.out.print("Nhập tuổi sinh viên ");
            studens[i].age=Integer.parseInt(sc.nextLine());
            System.out.print("Nhập màu sắc ");
            studens[i].color=sc.nextLine();
        }
        System.out.println(Arrays.toString(studens));//chưa khai báo phương thức toString sẽ trả về địa chỉ
        Studen studen3 = new Studen("abc");
        System.out.println(studen3);//có thể studen3.toString
    }
}
