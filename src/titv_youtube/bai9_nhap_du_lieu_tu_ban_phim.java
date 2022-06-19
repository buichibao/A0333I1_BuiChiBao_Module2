package titv_youtube;

import java.util.Scanner;

public class bai9_nhap_du_lieu_tu_ban_phim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên ");
        String name = sc.nextLine();
        System.out.println("Nhập mã sinh viên");
        long ID = sc.nextLong() ;
        System.out.println("Nhập điểm thi của bạn là ");
        float point = sc.nextFloat();

        System.out.println("----------");
        System.out.println("Tên bạn là "+name+ " mssv "+ID+ " điểm thi "+point);
    }
}

