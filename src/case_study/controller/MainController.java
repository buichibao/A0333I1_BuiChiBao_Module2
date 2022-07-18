package case_study.controller;

import java.util.Scanner;

public class MainController {
    Scanner scanner = new Scanner(System.in);
    public  void displayMainMenu(){
        int choose;
        do{
            System.out.println("====Menu====");
            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management");
            System.out.println("4.Booking Management");
            System.out.println("5.Promotion Management");
            System.out.println("6.Exit");
            System.out.print("Enter choose :");
            choose = Integer.parseInt(scanner.nextLine());
            if(choose<1||choose>6){
                System.out.print("No choose, enter again :");
                continue;
            }
            switch (choose){
                case 1:
                    employeeManagement();
                    break;
                case 2:
                    customerManagement();
                    break;
                case 3:
                    facilityManagement();
                    break;
                case 4:
                    bookingManagerment();
                    break;
                case 5:
                    promotionManagement();
                    break;
                case 6:
                    System.exit(0);
            }
        }while(true);


    }
    public  void employeeManagement(){
        int choose;
        do{
            System.out.println("1.Display list employees");
            System.out.println("2.Add new employee");
            System.out.println("3.Edit employee");
            System.out.println("4.Return main menu");
            System.out.print("Enter choose in menu Employee Management :");
            choose=Integer.parseInt(scanner.nextLine());
            if(choose <1||choose>4){
                System.out.print("No choose, enter choose again :");
                continue;
            }
            switch (choose){
                case 1:

                case 2:

                case 3:

                case 4:
                    displayMainMenu();
            }
        }while (true);
    }
    public void customerManagement(){
        int choose;
        do{
            System.out.println("1.Display list customers");
            System.out.println("2.Add new customers");
            System.out.println("3.Edit customers");
            System.out.println("4.Return main menu");
            System.out.print("Enter choose in menu Customer Management :");
            choose=Integer.parseInt(scanner.nextLine());
            if(choose <1||choose>4){
                System.out.print("No choose, enter choose again :");
                continue;
            }
            switch (choose){
                case 1:

                case 2:

                case 3:

                case 4:
                    displayMainMenu();
            }
        }while (true);
    }
    public void facilityManagement(){
        int choose;
        do{
            System.out.println("1.Display list facility");
            System.out.println("2.Add new facility");
            System.out.println("3.3 Display list facility maintenance");
            System.out.println("4.Return main menu");
            System.out.print("Enter choose in menu Customer Management :");
            choose=Integer.parseInt(scanner.nextLine());
            if(choose <1||choose>4){
                System.out.print("No choose, enter choose again :");
                continue;
            }
            switch (choose){
                case 1:

                case 2:

                case 3:

                case 4:
                    displayMainMenu();
            }
        }while (true);
    }
    public void bookingManagerment(){
        int choose;
        do{
            System.out.println("1.Add new booking");
            System.out.println("2.Display list booking");
            System.out.println("3.Create new constracts");
            System.out.println("4.Display list contracts");
            System.out.println("5.Edit contracts");
            System.out.println("6.Return main menu");
            System.out.print("Enter choose in menu Customer Management :");
            choose=Integer.parseInt(scanner.nextLine());
            if(choose <1||choose>6){
                System.out.print("No choose, enter choose again :");
                continue;
            }
            switch (choose){
                case 1:

                case 2:

                case 3:

                case 4:

                case 5:

                case 6:
                    displayMainMenu();
            }
        }while (true);
    }
    public void promotionManagement(){
        int choose;
        do{
            System.out.println("1.Display list customers use service");
            System.out.println("2. Display list customers get voucher");
            System.out.println("3. Return main menu");
            choose=Integer.parseInt(scanner.nextLine());
            if(choose <1||choose>3){
                System.out.print("No choose, enter choose again :");
                continue;
            }
            switch (choose){
                case 1:

                case 2:

                case 3:
                    displayMainMenu();
            }
        }while (true);
    }


}
