package case_study.controller;

import java.util.Scanner;

public class BookingManagermentController {
    public static void  menuBookingManagerment() {
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("====Menu Booking Managerment");
            System.out.println("1.Add new booking");
            System.out.println("2.Display list booking");
            System.out.println("3.Create new constracts");
            System.out.println("4.Display list contracts");
            System.out.println("5.Edit contracts");
            System.out.println("6.Return main menu");
            System.out.print("Mời bạn chọn chức năng bạn cần sử dụng :");
            int choose = Integer.parseInt(scanner.nextLine());
            if (choose < 1 || choose > 6) {
                System.out.print("Không tồn tại chức năng này mời bạn chọn lại:");
                continue;
            }
            switch (choose) {
                case 1:

                case 2:

                case 3:

                case 4:

                case 5:

                case 6:
                    return;
            }
        } while (true);
    }
}
