package ss10_list.demo.demo4.model;

public abstract class PhuongTien {
//    public HangSanXuat hangSanXuat = new HangSanXuat();
   private String bienSo;
   private String tenHangSanXuat;
   private int namSanXuat;
   private String chuSoHuu;

    public PhuongTien() {

    }

    public PhuongTien(String bienSo, String tenHangSanXuat, int namSanXuat, String chuSoHuu) {
//        this.hangSanXuat = hangSanXuat;
        this.bienSo = bienSo;
        this.tenHangSanXuat = tenHangSanXuat;
        this.namSanXuat = namSanXuat;
        this.chuSoHuu = chuSoHuu;
    }

    public String getBienSo() {
        return bienSo;
    }

    public void setBienSo(String bienSo) {
        this.bienSo = bienSo;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    @Override
    public String toString() {
        return
                "bienSo = '" + bienSo +
                ", tenHangSanXuat = '" + tenHangSanXuat +
                ", namSanXuat = " + namSanXuat +
                ", chuSoHuu = " + chuSoHuu;

    }
}
