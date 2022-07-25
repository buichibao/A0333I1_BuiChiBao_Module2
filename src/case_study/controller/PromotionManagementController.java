package case_study.controller;

import java.util.Scanner;

public class PromotionManagementController {
    public static void promotionManagement(){
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("=====Menu Promotion Management=====");
            System.out.println("1.Display list customers use service");
            System.out.println("2. Display list customers get voucher");
            System.out.println("3. Return main menu");
            System.out.print("Mời bạn chọn chức năng bạn sử dụng :");
            int choose=Integer.parseInt(scanner.nextLine());
            if(choose <1||choose>3){
                System.out.print("No choose, enter choose again :");
                continue;
            }
            switch (choose){
                case 1:

                case 2:

                case 3:
                    return;
            }
        }while (true);
    }

}
