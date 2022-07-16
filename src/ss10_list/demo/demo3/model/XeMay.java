package ss10_list.demo.demo3.model;

public class XeMay extends PhuongTien{
    private double congSuat;

    public XeMay(){

    }

    public XeMay(double congSuat) {
        this.congSuat = congSuat;
    }

    public XeMay(String bienKiemSoat, String tenHang, int namSanXuat, String chuSoHuu, double congSuat) {
        super(bienKiemSoat, tenHang, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "XeMay{" +
                "congSuat=" + congSuat + super.toString()+
                '}';
    }
}
