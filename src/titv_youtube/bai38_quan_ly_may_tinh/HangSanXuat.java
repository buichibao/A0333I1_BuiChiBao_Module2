package titv_youtube.bai38_quan_ly_may_tinh;

import titv_youtube.bai36_quan_ly_phim.HangSx;

public class HangSanXuat {

    private  String tenHang;
    private QuocGia quocGia;

    public HangSanXuat(String tenHang,QuocGia quocGia){
        this.tenHang=tenHang;
        this.quocGia=quocGia;
    }

    public QuocGia getQuocGia() {
        return this.quocGia;
    }

    public String getTenHang() {
        return this.tenHang;
    }

    public void setQuocGia(QuocGia quocGia) {
        this.quocGia = quocGia;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }
}
