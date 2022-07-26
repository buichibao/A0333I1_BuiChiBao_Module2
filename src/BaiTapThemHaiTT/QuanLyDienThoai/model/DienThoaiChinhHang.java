package BaiTapThemHaiTT.QuanLyDienThoai.model;

public class DienThoaiChinhHang extends  DienThoai{
    private  int thoiGianBaoHanh;
    private String phamViBaoHanh;

    public DienThoaiChinhHang(){

    }



    public DienThoaiChinhHang(int thoiGianBaoHanh, String phamViBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.phamViBaoHanh = phamViBaoHanh;
    }

    public DienThoaiChinhHang(String ten, double giaBan, int soLuong, String nhaSanXuat, int thoiGianBaoHanh, String phamViBaoHanh) {
        super(ten, giaBan, soLuong, nhaSanXuat);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.phamViBaoHanh = phamViBaoHanh;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public String getPhamViBaoHanh() {
        return phamViBaoHanh;
    }

    public void setPhamViBaoHanh(String phamViBaoHanh) {
        this.phamViBaoHanh = phamViBaoHanh;
    }

    @Override
    public String toString() {
        return   super.toString()+
                "thoiGianBaoHanh='" + thoiGianBaoHanh + '\'' +
                ", phamViBaoHanh='" + phamViBaoHanh + '\'' +
                '}';
    }

    @Override
    public String info() {
        return String.format("%s,%f,%d,%s,%s,%s\n",this.getTen(),this.getGiaBan(),this.getSoLuong(),this.getNhaSanXuat(),this.getThoiGianBaoHanh(),this.getPhamViBaoHanh());
    }
}
