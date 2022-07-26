package BaiTapThemHaiTT.QuanLyDienThoai.service.impl;

import BaiTapThemHaiTT.QuanLyDienThoai.model.DienThoai;
import BaiTapThemHaiTT.QuanLyDienThoai.model.DienThoaiChinhHang;
import BaiTapThemHaiTT.QuanLyDienThoai.model.DienThoaiXachTay;
import BaiTapThemHaiTT.QuanLyDienThoai.service.IDienThoai;
import BaiTapThemHaiTT.QuanLyDienThoai.utils.DocGhiFileDienThoaiXachTay;

import java.util.List;
import java.util.Scanner;

public class DienThoaiXachTayService implements IDienThoai {
    static final String PATH ="src\\BaiTapThemHaiTT\\QuanLyDienThoai\\data\\mobiles.csv";
    static Scanner scanner = new Scanner(System.in);
    @Override
    public void them() {
        List<DienThoaiXachTay> dienThoaiList1 = DocGhiFileDienThoaiXachTay.docFileDienThoaiXachTay(PATH);
        DienThoaiXachTay dienThoaiXachTay = nhapThongTin();
        dienThoaiList1.add(dienThoaiXachTay);
        DocGhiFileDienThoaiXachTay.vietFileDienThoaiXachTay(PATH,dienThoaiList1);
    }

    @Override
    public void xoa() {

    }

    @Override
    public void hienThi() {

    }

    @Override
    public void timKiem() {

    }
    public static DienThoaiXachTay nhapThongTin(){
        System.out.print("Nhập tên điện thoại:");
        String ten = scanner.nextLine();
        System.out.print("Nhập giá bán :");
        double giaBan = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập số lượng :");
        int soLuong = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập nhà sản xuất :");
        String nhaSanXuat = scanner.nextLine();
        System.out.print("Nhập quốc gia xách tay :");
        String quocGia = scanner.nextLine();
        System.out.print("Nhập trạn thái :");
        String trangThai = scanner.nextLine();
        return new DienThoaiXachTay(ten,giaBan,soLuong,nhaSanXuat,quocGia,trangThai);
    }
}
