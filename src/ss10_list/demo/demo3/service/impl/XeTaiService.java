package ss10_list.demo.demo3.service.impl;

import ss10_list.demo.demo3.model.XeMay;
import ss10_list.demo.demo3.model.XeTai;
import ss10_list.demo.demo3.service.IPhuongTien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XeTaiService implements IPhuongTien {
    Scanner scanner = new Scanner(System.in);
    static List<XeTai> xeTaiList = new ArrayList<>();

    @Override
    public void themXe() {
        XeTai xeTai = nhapThuocTinhXeTai();
        xeTaiList.add(xeTai);
        System.out.println("Thêm xe máy thành công và danh sách");
    }

    @Override
    public void xoaXe() {
        boolean kiemTraBienSoXe = false;
        System.out.println("Nhập biển số xe cần xóa :");
        String bienSoXeCanXoa = scanner.nextLine();
        for (XeTai xeTai : xeTaiList) {
            if (bienSoXeCanXoa == xeTai.getBienKiemSoat()) {
                System.out.println("Bạn có muốn xóa xe tải có biển số " + bienSoXeCanXoa + " này không ");
                System.out.println("1.Có");
                System.out.println("2.Không");
                int luaChon = Integer.parseInt(scanner.nextLine());
                if (luaChon == 1) {
                    xeTaiList.remove(xeTai);
                    System.out.println("Xóa thành công");
                }
                kiemTraBienSoXe = true;
                break;
            }
            if (!kiemTraBienSoXe) {
                System.out.println("Không tìm thấy biển số xe này!!");
            }

        }
    }

    @Override
    public void hienThiDSXe() {
        for (XeTai xeTai : xeTaiList) {
            System.out.println(xeTai);
        }
    }


    @Override
    public void timBienSoXe() {
        boolean kiemTraBienSoXe = false;
        System.out.println("Nhập biển số cần tìm :");
        String bienSoCanTim = scanner.nextLine();
        for (XeTai xeTai : xeTaiList) {
            if (bienSoCanTim == xeTai.getBienKiemSoat()) {
                System.out.println(xeTai);
                kiemTraBienSoXe = true;
                break;
            }
            if (!kiemTraBienSoXe) {
                System.out.println("Không tìm thấy biển số bạn muốn!!");
            }
        }
    }
    public XeTai nhapThuocTinhXeTai() {
        System.out.println("Nhập biển số xe :");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("Nhập tên hãng sản xuất :");
        String tenHang = scanner.nextLine();
        System.out.println("Nhập năm sản xuất :");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chủ sở hữu :");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Nhập trọng tải :");
        double trongTai = Double.parseDouble(scanner.nextLine());

        XeTai xeTai = new XeTai(bienKiemSoat, tenHang, namSanXuat, chuSoHuu, trongTai);
        return xeTai;
    }

}

