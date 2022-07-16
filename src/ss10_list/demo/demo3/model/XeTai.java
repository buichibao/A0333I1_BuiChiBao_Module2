package ss10_list.demo.demo3.model;

public class XeTai extends  PhuongTien{
    private  double trongTai;

    public XeTai(){

    }

    public XeTai(double trongTai) {
        this.trongTai = trongTai;
    }

    public XeTai(String bienKiemSoat, String tenHang, int namSanXuat, String chuSoHuu, double trongTai) {
        super(bienKiemSoat, tenHang, namSanXuat, chuSoHuu);
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
                "trongTai=" + trongTai +super.toString()+
                '}';
    }
}
