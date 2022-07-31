package case_study.controller;

import case_study.Exception.EnterException;

import java.util.Scanner;

public class FuramaController {

    public static  void displayMainMenu(){
        Scanner scanner = new Scanner(System.in);
        int choose;
        do{
            try {
                System.out.println("====Chương Trình Quản Lý Furama====");
                System.out.println("1.Quản lý nhân viên");
                System.out.println("2.Quản lý khách hàng");
                System.out.println("3.Quản lý cơ sở");
                System.out.println("4.Quản lý đặt chỗ");
                System.out.println("5.Quản lý khuyến mãi");
                System.out.println("6.Thoát");
                System.out.print("Chọn chức năng :");
                choose = Integer.parseInt(scanner.nextLine());
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
                    default:
                        throw new EnterException("Bạn phải nhập số từ 1->6,mời bạn nhập lại");
                }
            }catch (EnterException e){
                System.out.println(e.getMessage());
            }catch (NumberFormatException e){
                System.out.println("Bạn đang nhập vào kí tự , bạn hãy nhập số đi");
            }

        }while(true);

    }
}
