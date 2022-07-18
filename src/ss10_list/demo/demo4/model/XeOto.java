package ss10_list.demo.demo4.model;

public class XeOto extends PhuongTien {
    private int choNgoi;
    private String kieuXe;

    public  XeOto(){

    }

    public XeOto(int choNgoi, String kieuXe) {
        this.choNgoi = choNgoi;
        this.kieuXe = kieuXe;
    }

    public XeOto(String bienSo, String tenHangSanXuat, int namSanXuat, String chuSoHuu, int choNgoi, String kieuXe) {
        super(bienSo, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.choNgoi = choNgoi;
        this.kieuXe = kieuXe;
    }

    public int getChoNgoi() {
        return choNgoi;
    }

    public void setChoNgoi(int choNgoi) {
        this.choNgoi = choNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return "XeOto{" +
                "choNgoi=" + choNgoi +
                ", kieuXe='" + kieuXe  +
                super.toString()+
                '}';
    }
}
