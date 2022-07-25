package case_study.controller;

import java.util.Scanner;

public class FacilityManagementController {

    public static void menuFacilityManagement(){
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("=====Menu Facility Management=====");
            System.out.println("1.Display list facility");
            System.out.println("2.Add new facility");
            System.out.println("3.3 Display list facility maintenance");
            System.out.println("4.Return main menu");
            System.out.print("Mời bạn chọn chức năng bạn cần sử dụng:");
            int choose=Integer.parseInt(scanner.nextLine());
            if(choose <1||choose>4){
                System.out.print("Không có chức năng này mời bạn chọn lại!!");
                continue;
            }
            switch (choose){
                case 1:

                case 2:

                case 3:

                case 4:
                  return;
            }
        }while (true);
    }
}
