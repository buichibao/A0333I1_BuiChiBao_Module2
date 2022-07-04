package ss3_array_method.ThucHanh;

import java.util.Scanner;

public class SeachElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] list = new String[5];
        System.out.println("Nhập các phần tử của mảng");
        for(int i = 0;i<list.length;i++){
            System.out.print("list ["+i+"] = ");
            list[i]= sc.nextLine();
        }
        System.out.println();
        System.out.println("Mảng vừa nhập là");
        for (int i = 0; i <list.length ; i++) {
            System.out.print(list[i]+" ");
        }
        String element;
        System.out.println();
        System.out.print("Nhập tên bạn cần tìm :");
        element = sc.nextLine();
        System.out.println("Kết quả tìm kiếm ");
        boolean check = false;
        for (int i = 0; i <list.length ; i++) {
            if(element.equals(list[i])){
                System.out.println("Tìm thấy");
                check =true;
                break;
            }
        }
        if(!check){
            System.out.println("Không tìm thấy");
        }

    }
}
