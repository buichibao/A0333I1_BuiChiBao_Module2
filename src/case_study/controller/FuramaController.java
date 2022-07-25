package case_study.controller;

import java.util.Scanner;

public class FuramaController {

    public static  void displayMainMenu(){
        Scanner scanner = new Scanner(System.in);
        int choose;
        do{
            System.out.println("====Menu====");
            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management");
            System.out.println("4.Booking Management");
            System.out.println("5.Promotion Management");
            System.out.println("6.Exit");
            System.out.print("Chọn chức năng :");
            choose = Integer.parseInt(scanner.nextLine());
            if(choose<1||choose>6){
                System.out.print("Không có chức năng này mời bạn chọn lại:");
                continue;
            }
            switch (choose){
                case 1:
                    EmployeeManagementController.menuEmployeeManagement();
                    break;
                case 2:
                    CustomerManagementController.menuCustomerManagement();
                    break;
                case 3:
                    FacilityManagementController.menuFacilityManagement();
                    break;
                case 4:
                    BookingManagermentController.menuBookingManagerment();
                    break;
                case 5:
                    PromotionManagementController.promotionManagement();
                    break;
                case 6:
                    System.exit(0);
            }
        }while(true);

    }
}
