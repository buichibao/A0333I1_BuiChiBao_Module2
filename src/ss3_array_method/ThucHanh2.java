package ss3_array_method;

import java.util.Scanner;

public class ThucHanh2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] student  = {"Bao","Nam","Phu","Tham","Nhat","Thanh",};
        System.out.println("Nhập tên cần tìm");
        String name = scanner.nextLine();
        boolean check = false;
        for (int i = 0;i<student.length;i++){
            if(student[i].equals(name)){
                check = true;
                break;
            }
        }
        if(check==true){

            System.out.println("Tìm Thấy!!");
        }else{
            System.out.println("Không tìm thấy");
        }
    }
}
