package BaiTapThemHaiTT.QuanLyDienThoai.service.impl;

import BaiTapThemHaiTT.QuanLyDienThoai.model.DienThoai;
import BaiTapThemHaiTT.QuanLyDienThoai.model.DienThoaiChinhHang;
import BaiTapThemHaiTT.QuanLyDienThoai.service.IDienThoai;
import BaiTapThemHaiTT.QuanLyDienThoai.utils.DocGhiFileDienThoaiChinhHang;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DienThoaiChinhHangService implements IDienThoai {
    static final String PATH = "src\\BaiTapThemHaiTT\\QuanLyDienThoai\\data\\mobiles.csv";
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void them() {
        List<DienThoaiChinhHang> dienThoaiList = DocGhiFileDienThoaiChinhHang.docFileDienThoaiChinhHang(PATH);
        DienThoaiChinhHang dienThoaiChinhHang = nhapThongTin();
        dienThoaiList.add(dienThoaiChinhHang);
        DocGhiFileDienThoaiChinhHang.vietFileDienThoaiChinhHang(PATH, dienThoaiList);
    }

    @Override
    public void xoa() {
        List<DienThoaiChinhHang> dienThoaiList = DocGhiFileDienThoaiChinhHang.docFileDienThoaiChinhHang(PATH);

    }

    @Override
    public void hienThi() {
        List<DienThoaiChinhHang> dienThoaiList = DocGhiFileDienThoaiChinhHang.docFileDienThoaiChinhHang(PATH);
        for (DienThoaiChinhHang dienThoaiChinhHang : dienThoaiList) {
            if ((dienThoaiChinhHang.getPhamViBaoHanh().contains("Toan Quoc"))||(dienThoaiChinhHang.getPhamViBaoHanh().contains("Quoc Te"))) {
                System.out.println(dienThoaiChinhHang);
            }
        }
    }

    @Override
    public void timKiem() {

    }

    public static DienThoaiChinhHang nhapThongTin() {
        System.out.print("Nhập tên điện thoại:");
        String ten = scanner.nextLine();
        System.out.print("Nhập giá bán :");
        double giaBan = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập số lượng :");
        int soLuong = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập nhà sản xuất :");
        String nhaSanXuat = scanner.nextLine();
        System.out.print("Nhập thời gian bảo hành :");
        int thoiGianBaoHanh =Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập phạm vi bản hành :");
        String phamViBaoHanh = scanner.nextLine();
        return new DienThoaiChinhHang(ten, giaBan, soLuong, nhaSanXuat, thoiGianBaoHanh, phamViBaoHanh);
    }
}
