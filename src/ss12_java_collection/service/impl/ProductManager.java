package ss12.service.impl;

import ss12.model.Product;
import ss12.service.IProduct;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager implements IProduct {
    Scanner scanner = new Scanner(System.in);
     static  ArrayList<Product> products = new ArrayList<>();
    @Override
    public void addSP() {
      Product product = inFor();
      products.add(product);
        System.out.println("Thêm sản phẩm thành công");
    }

    @Override
    public void removeSP() {
      boolean check = false;
        System.out.println("Nhập id cần xóa");
        String idRemove = scanner.nextLine();
        for (Product product:products) {
            if(idRemove.equals(product.getId())){
                System.out.println("Bạn có muốn xóa không ?");
                System.out.println("1.CÓ");
                System.out.println("2.KHÔNG");
                int choose = Integer.parseInt(scanner.nextLine());
                if(choose==1){
                    products.remove(product);
                    System.out.println("Xóa thành công");
                    check = true;
                    break;
                }
            }
        }
        if(!check){
            System.out.println("Không tìm thấy đối tượng để xóa");
        }
    }

    @Override
    public void displayAll() {
        if(!products.isEmpty()){
            for (Product product:products) {
                System.out.println(product);
            }
        }else{
            System.out.println("Mảng đang trống");
        }
    }


    @Override
    public void find() {
       boolean check = false;
        System.out.print("Nhập tên cần tìm :");
        String name= scanner.nextLine();
        for (Product product:products) {
            if(name.equals(product.getName())){
                System.out.println(product);
                check = true;
                continue;
            }
        }
        if(!check){
            System.out.println("Không tìm thấy");
        }
    }

    @Override
    public void set() {
      boolean check = false;
        System.out.println("Nhập id của sản phẩm cần chỉnh sửa");
        String idSet = scanner.nextLine();
        for (Product product: products) {
            if(idSet.equals(product.getId())){
                System.out.print("Nhập mã sản phẩm mới :");
                String newID = scanner.nextLine();
                System.out.print("Nhập tên sản phẩm mới :");
                String newName = scanner.nextLine();
                System.out.print("Nhập giá của sản phẩm mới :");
                double newPrice = Double.parseDouble(scanner.nextLine());
                product.setId(newID);
                product.setName(newName);
                product.setPrice(newPrice);
                check = true;
                break;
            }
        }
        if(!check){
            System.out.println("Không tìm thấy sản phẩm với id = "+idSet);
        }
      
    }

    @Override
    public void sort() {

    }
    public Product inFor(){
        System.out.print("Nhập mã sản phẩm :");
        String id = scanner.nextLine();
        System.out.print("Nhập tên sản phẩm :");
        String name = scanner.nextLine();
        System.out.print("Nhập giá của sản phẩm :");
        double price = Double.parseDouble(scanner.nextLine());

        Product product = new Product(id,name,price);
        return product;
    }
}
