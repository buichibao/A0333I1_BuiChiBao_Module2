package titv_youtube.bai38_quan_ly_may_tinh;

public class MayTinh {
    private HangSanXuat hangSanXuat;
    private NgaySanXuat ngaySanXuat;
    private double giaBan;
    private double thoiGianBaoHanh;

    public  MayTinh(HangSanXuat hangSanXuat,NgaySanXuat ngaySanXuat,double giaBan,double thoiGianBaoHanh){
        this.giaBan=giaBan;
        this.hangSanXuat=hangSanXuat;
        this.thoiGianBaoHanh=thoiGianBaoHanh;
        this.ngaySanXuat=ngaySanXuat;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public double getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public NgaySanXuat getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public void setNgaySanXuat(NgaySanXuat ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public void setThoiGianBaoHanh(double thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }
    public boolean kiemTraGiaReHon(MayTinh mayTinhKhac){
        return this.getGiaBan()<mayTinhKhac.getGiaBan();
//        return this.giaBan<mayTinhKhac.giaBan;
    }
//    public String layTenQuocGiaSanXuatMayTinh(){
//        return this.hangSanXuat.getQuocGia();
//    }
}
