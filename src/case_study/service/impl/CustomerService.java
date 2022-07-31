package case_study.service.impl;

import case_study.model.Customer;
import case_study.service.IPersonService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements IPersonService {
    private static List<Customer> customerList;
    private static final Scanner SCANNER = new Scanner(System.in);

    static {
        customerList = new LinkedList<>();

    }

    @Override
    public void disPlay() {
        if (customerList.isEmpty()) {
            System.out.println("Danh sách khách hàng đang trống");
        }
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
//        for (int i = 0; i <customerList.size() ; i++) {
//            System.out.println(customerList.get(i));
//        }
    }

    @Override
    public void add() {
        Customer customer = infoCustomer();
        customerList.add(customer);
        System.out.println("Thêm thành công");
    }

    @Override
    public void edit() {
        boolean check = false;
        boolean flag = true;
        System.out.print("Nhập id của khách hàng cần chỉnh sửa :");
        String idFind = SCANNER.nextLine();
        for (Customer customer : customerList) {
            if (customer.getIdCustomer().equals(idFind)) {
                System.out.println(customer);
                check = true;
                int chooseEdit;
                do {
                    System.out.println("Chọn thông tin cần chỉnh sửa của khách hàng:");
                    System.out.println("1.Tên ");
                    System.out.println("2.Ngày sinh");
                    System.out.println("3.Giới tính");
                    System.out.println("4.Số CMND ");
                    System.out.println("5.Sô điện thoại");
                    System.out.println("6.Email");
                    System.out.println("7.Mã khách hàng");
                    System.out.println("8.Loại khách");
                    System.out.println("9.Địa chỉ khách hàng");
                    System.out.println("0.exit");
                    System.out.print("Chọn chức năng tương ứng :");
                    chooseEdit = Integer.parseInt(SCANNER.nextLine());
                    switch (chooseEdit) {
                        case 1:
                            System.out.print("Nhập tên mới của khách hàng  :");
                            String name = SCANNER.nextLine();
                            customer.setName(name);
                            break;
                        case 2:
                            System.out.print("Nhập ngày mới của sinh khách hàng :");
                            String dateOfBirth = SCANNER.nextLine();
                            customer.setDateOfBirth(dateOfBirth);
                            break;
                        case 3:
                            System.out.print("Nhập giới tính mới của khách hàng :");
                            String sex = SCANNER.nextLine();
                            customer.setSex(sex);
                            break;
                        case 4:
                            System.out.print("Nhập số CMND mới của khách hàng :");
                            int idNumber = Integer.parseInt(SCANNER.nextLine());
                            customer.setIdNumber(idNumber);
                            break;
                        case 5:
                            System.out.print("Nhập số điện thoại mới của khách hàng:");
                            String numberPhone = SCANNER.nextLine();
                            customer.setNumberPhone(numberPhone);
                            break;
                        case 6:
                            System.out.print("Nhập email mới của khách hàng :");
                            String email = SCANNER.nextLine();
                            customer.setEmail(email);
                            break;
                        case 7:
                            System.out.print("Nhập id mới của khách hàng : ");
                            String idCustomer = SCANNER.nextLine();
                            customer.setIdCustomer(idCustomer);
                            break;
                        case 8:
                            System.out.print("Nhập loại khách hàng mới:");
                            String customerType = SCANNER.nextLine();
                            customer.setCustomerType(customerType);
                            break;
                        case 9:
                            System.out.print("Nhập địa chỉ mới :");
                            String address = SCANNER.nextLine();
                            customer.setAddress(address);
                            break;
                        case 0:
                            flag = false;
                            break;
                        default:
                            System.out.println("Không có thông tin này");
                    }
                } while (flag);
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy khách hàng này có Id " + idFind);
        }

    }

    public static Customer infoCustomer() {

        System.out.print("Nhập tên Khách hàng :");
        String name = SCANNER.nextLine();

        System.out.print("Nhập ngày sinh Khách hàng :");
        String dateOfBirth = SCANNER.nextLine();

        System.out.print("Nhập nhập giới tính :");
        String sex = SCANNER.nextLine();

        System.out.print("Nhập số CMND :");
        int idNumber = Integer.parseInt(SCANNER.nextLine());

        String numberPhone;
        do {
            System.out.print("Nhập số điện thoại :");
            numberPhone = SCANNER.nextLine();
            if ((numberPhone.matches("0[0-9]{9}"))) {
                break;
            } else {
                System.out.println("Nhập sai định dạng");
            }
        } while (true);

        System.out.print("Nhập email :");
        String email = SCANNER.nextLine();


        System.out.print("Nhập id khách hàng : ");
        String idCustomer = SCANNER.nextLine();

        System.out.print("Nhập loại khách :");
        String customerType = SCANNER.nextLine();

        System.out.print("Nhập địa chỉ :");
        String address = SCANNER.nextLine();


        return new Customer(name, dateOfBirth, sex, idNumber, numberPhone, email, idCustomer, customerType, address);
    }

}
