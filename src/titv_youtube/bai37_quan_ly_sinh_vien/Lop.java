package titv_youtube.bai37_quan_ly_sinh_vien;

public class Lop {
    private String tenKhoa;
    private String tenLop;

    public Lop(String tenKhoa,String tenLop){
        this.tenKhoa=tenKhoa;
        this.tenLop=tenLop;
    }

    public String getTenKhoa() {
        return this.tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

    public String getTenLop() {
        return this.tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }
}
