package ss10_list.demo.demo4.model;

public class HangSanXuat {
    private String maSanXuat;
    private String tenHangSanXuat;
    private String quocGia;

    public HangSanXuat() {
    }

    public HangSanXuat(String maSanXuat, String tenHangSanXuat, String quocGia) {
        this.maSanXuat = maSanXuat;
        this.tenHangSanXuat = tenHangSanXuat;
        this.quocGia = quocGia;
    }
    public String getMaSanXuat() {
        return maSanXuat;
    }

    public void setMaSanXuat(String maSanXuat) {
        this.maSanXuat = maSanXuat;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }
    public void  nhapThongTinHang(){

    }
}
