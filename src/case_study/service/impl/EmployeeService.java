package case_study.service.impl;

import case_study.model.Employee;
import case_study.service.IPersonService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IPersonService {
    private static final Scanner SCANNER = new Scanner(System.in);
    static List<Employee> employeeList;

    static {
        employeeList = new ArrayList<>();
    }

    @Override
    public void disPlay() {
        if (employeeList.isEmpty()) {
            System.out.println("Danh sách nhân viên đang trống");
        }
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void add() {
        Employee employee = infoEmployee();
        employeeList.add(employee);
        System.out.println("Thêm thành công");
    }

    @Override
    public void edit() {
        boolean check = false;
        boolean flag = true;
        System.out.print("Nhập id của nhân viên cần chỉnh sửa :");
        String idFind = SCANNER.nextLine();
        for (Employee employee : employeeList) {
            if (employee.getIdEmployee().equals(idFind)) {
                System.out.println(employee);
                check = true;
                int chooseEdit;
                do {
                    System.out.println("Chọn thông tin cần chỉnh sửa của nhân viên:");
                    System.out.println("1.Tên ");
                    System.out.println("2.Ngày sinh");
                    System.out.println("3.Giới tính");
                    System.out.println("4.Số CMND ");
                    System.out.println("5.Sô điện thoại");
                    System.out.println("6.Email");
                    System.out.println("7.Mã nhân viên");
                    System.out.println("8.Trình độ");
                    System.out.println("9.Vị trí");
                    System.out.println("10.Lương");
                    System.out.println("0.exit");
                    System.out.print("Chọn chức năng tương ứng :");
                    chooseEdit = Integer.parseInt(SCANNER.nextLine());
                    switch (chooseEdit) {
                        case 1:
                            System.out.print("Nhập tên mới của nhân viên  :");
                            String name = SCANNER.nextLine();
                            employee.setName(name);
                            break;
                        case 2:
                            System.out.print("Nhập ngày mới của sinh nhân viên :");
                            String dateOfBirth = SCANNER.nextLine();
                            employee.setDateOfBirth(dateOfBirth);
                            break;
                        case 3:
                            System.out.print("Nhập giới tính mới của nhân viên :");
                            String sex = SCANNER.nextLine();
                            employee.setSex(sex);
                            break;
                        case 4:
                            System.out.print("Nhập số CMND mới của nhân viên :");
                            int idNumber = Integer.parseInt(SCANNER.nextLine());
                            employee.setIdNumber(idNumber);
                            break;
                        case 5:
                            System.out.print("Nhập số điện thoại mới của nhân viên :");
                            String numberPhone = SCANNER.nextLine();
                            employee.setNumberPhone(numberPhone);
                            break;
                        case 6:
                            System.out.print("Nhập email mới của nhân viên :");
                            String email = SCANNER.nextLine();
                            employee.setEmail(email);
                            break;
                        case 7:
                            System.out.print("Nhập id mới của nhân viên : ");
                            String idEmployee = SCANNER.nextLine();
                            employee.setIdEmployee(idEmployee);
                            break;
                        case 8:
                            System.out.print("Nhập trình độ mới :");
                            String educationLevel = SCANNER.nextLine();
                            employee.setEducationLevel(educationLevel);
                            break;
                        case 9:
                            System.out.print("Nhập vị trí mới của nhân viên :");
                            String location = SCANNER.nextLine();
                            employee.setLocation(location);
                            break;
                        case 10:
                            System.out.print("Nhập lương nhân viên :");
                            double salary = Double.parseDouble(SCANNER.nextLine());
                            employee.setSalary(salary);
                            break;
                        case 0:
                            flag=false;
                            break;
                        default:
                            System.out.println("Không có thông tin này");
                    }
                } while (flag);
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy nhân viên có Id " + idFind);
        }

    }

    public static Employee infoEmployee() {

        System.out.print("Nhập tên nhân viên :");
        String name = SCANNER.nextLine();

        System.out.print("Nhập ngày sinh nhân viên :");
        String dateOfBirth = SCANNER.nextLine();

        System.out.print("Nhập nhập giới tính :");
        String sex = SCANNER.nextLine();

        System.out.print("Nhập số CMND :");
        int idNumber = Integer.parseInt(SCANNER.nextLine());

        System.out.print("Nhập số điện thoại :");
        String numberPhone = SCANNER.nextLine();

        System.out.print("Nhập email :");
        String email = SCANNER.nextLine();

        System.out.print("Nhập id nhân viên : ");
        String idEmployee = SCANNER.nextLine();

        System.out.print("Nhập trình độ :");
        String educationLevel = SCANNER.nextLine();

        System.out.print("Nhập vị trí :");
        String location = SCANNER.nextLine();

        System.out.print("Nhập lương nhân viên :");
        double salary = Double.parseDouble(SCANNER.nextLine());

        return new Employee(name, dateOfBirth, sex, idNumber, numberPhone, email, idEmployee, educationLevel, location, salary);
    }
}
