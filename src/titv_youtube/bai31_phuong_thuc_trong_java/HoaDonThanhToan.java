package titv_youtube.bai31_phuong_thuc_trong_java;

public class HoaDonThanhToan {
    private String tenLoaiCaPhe;
    private double soTienTren1kg;
    private double khoiLuong;

    public HoaDonThanhToan(){

    }
    public HoaDonThanhToan(String tenLoaiCaPhe,double soTienTren1kg,double khoiLuong){
        this.tenLoaiCaPhe = tenLoaiCaPhe;
        this.soTienTren1kg = soTienTren1kg;
        this.khoiLuong = khoiLuong;
    }
    public double tinhTongTien(){
        return this.khoiLuong*this.soTienTren1kg;
    }
    public boolean kiemTraKhoiLuong(double khoiLuong){
        return this.khoiLuong>khoiLuong;
    }
    public boolean kiemTraSoTien(){
        return this.tinhTongTien()>500;
    }
    public double giamGia(double x){
        if(tinhTongTien()>500000){
            return (x/100)*tinhTongTien();
        }else{
            return 0;
        }
    }
    public double soTienSauKhiGiamGia(double x){
        return this.tinhTongTien()-this.giamGia(x);
    }
}
