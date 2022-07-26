package BaiTapThemHaiTT.QuanLyDienThoai.model;

public class DienThoaiXachTay extends DienThoai{
    private  String quocGiaXachTay ;
    private String trangThai;

    public DienThoaiXachTay(){

    }

    public DienThoaiXachTay(String quocGiaXachTay, String trangThai) {
        this.quocGiaXachTay = quocGiaXachTay;
        this.trangThai = trangThai;
    }

    public DienThoaiXachTay(String ten, double giaBan, int soLuong, String nhaSanXuat, String quocGiaXachTay, String trangThai) {
        super(ten, giaBan, soLuong, nhaSanXuat);
        this.quocGiaXachTay = quocGiaXachTay;
        this.trangThai = trangThai;
    }

    public String getQuocGiaXachTay() {
        return quocGiaXachTay;
    }

    public void setQuocGiaXachTay(String quocGiaXachTay) {
        this.quocGiaXachTay = quocGiaXachTay;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "quocGiaXachTay='" + quocGiaXachTay + '\'' +
                ", trangThai='" + trangThai + '\'' +
                '}';
    }
    @Override
    public String info() {
        return String.format("%s,%f,%d,%s,%s,%s\n",this.getTen(),this.getGiaBan(),this.getSoLuong(),this.getNhaSanXuat(),this.getQuocGiaXachTay(),this.getTrangThai());
    }
}
