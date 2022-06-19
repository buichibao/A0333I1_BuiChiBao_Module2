package titv_youtube.bai35_quan_ly_sach;

public class Sach {
    private String tenSach;
    private double giaBan;
    private int namXuatBan;
    private TacGia tacGia;

    public Sach(String tenSach,double giaBan, int namXuatBan,TacGia tacGia){
        this.tenSach = tenSach;
        this.giaBan = giaBan;
        this.namXuatBan = namXuatBan;
        this.tacGia =tacGia;
    }
    public void inTenSach(){
        System.out.println("Tên sách : "+this.tenSach);
    }
    public boolean kiemTraCungNam(Sach sachKhac){
        if(this.namXuatBan==sachKhac.namXuatBan){
            return true;
        }
        return false;
    }
    public double giaSauKhiGiam(double x){
        return this.giaBan-(x/100)*this.giaBan;
    }
}
