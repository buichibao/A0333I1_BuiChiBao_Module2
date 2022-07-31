package case_study.controller;

import case_study.Exception.EnterException;
import case_study.service.impl.CustomerService;

import java.util.Scanner;

public class CustomerManagementController {
    public static void menuCustomerManagement(){
        CustomerService customerService = new CustomerService();
        Scanner scanner = new Scanner(System.in);

        do{
            try {
                System.out.println("====Quản Lý Khách Hàng====");
                System.out.println("1.Hiển thị danh sách khách hàng");
                System.out.println("2.Thêm khách hàng mới");
                System.out.println("3.Thay đổi thông tin khách hàng");
                System.out.println("4.Quay lại menu chính");
                System.out.print("Nhập chức năng bạn muốn sử dụng :");

                int choose=Integer.parseInt(scanner.nextLine());
                switch (choose){
                    case 1:
                        customerService.disPlay();
                        break;
                    case 2:
                        customerService.add();
                        break;
                    case 3:
                        customerService.edit();
                        break;
                    case 4:
                        return;
                    default:
                        throw  new EnterException("Nhập lại đi sai rồi đó, phải là từ 1->4");
                }
            } catch (EnterException e) {
                System.out.println(e.getMessage());
            }catch (NumberFormatException e){
                System.out.println("Nhập số đi");
            }
        } while (true);

    }

}
