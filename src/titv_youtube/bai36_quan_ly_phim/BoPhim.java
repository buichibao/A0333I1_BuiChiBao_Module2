package titv_youtube.bai36_quan_ly_phim;

public class BoPhim {
    private String tenPhim;
    private int namSanXuat;
    private HangSx hangSx;
    private double giaVe;
    private NgayChieu ngayChieu;

    public BoPhim(String tenPhim,int namSanXuat,HangSx hangSx,double giaVe,NgayChieu ngayChieu){
        this.tenPhim=tenPhim;
        this.namSanXuat=namSanXuat;
        this.hangSx=hangSx;
        this.giaVe=giaVe;
        this.ngayChieu=ngayChieu;
    }

    public String getTenPhim() {

        return this.tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public int getNamSanXuat() {

        return this.namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {

        this.namSanXuat = namSanXuat;
    }

    public HangSx getHangSx() {

        return this.hangSx;
    }

    public void setHangSx(HangSx hangSx) {

        this.hangSx = hangSx;
    }

    public double getGiaVe() {
        return this.giaVe;
    }

    public void setGiaVe(double giaVe) {

        this.giaVe = giaVe;
    }

    public NgayChieu getNgayChieu() {

        return this.ngayChieu;
    }

    public void setNgayChieu(NgayChieu ngayChieu) {

        this.ngayChieu = ngayChieu;
    }
    public boolean kiemTraGiaVeReHon(BoPhim phimKhac){
        return this.giaVe<phimKhac.giaVe;
    }
    public  String layTenHangSanXuatPhim(){

        return  this.hangSx.getTenHangSanXuat();//???
    }
    public double giaSauKhuyenMai(double x){

        return this.getGiaVe()-(x/100)*getGiaVe();
        //this.giaVe hay dùng hàm get
    }
}
