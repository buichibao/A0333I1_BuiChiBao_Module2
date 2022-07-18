package ss10_list.demo.demo4.model;

public class XeTai extends  PhuongTien {
    private double trongTai;

    public XeTai(){

    }
    public XeTai(double trongTai) {
        this.trongTai = trongTai;
    }
    public XeTai(String bienSo, String tenHangSanXuat, int namSanXuat, String chuSoHuu, double trongTai) {
        super(bienSo, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "XeTai{" +
                "trongTai=" + trongTai +
                super.toString()+
                '}';
    }
}
