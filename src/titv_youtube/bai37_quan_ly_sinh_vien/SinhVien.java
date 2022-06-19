package titv_youtube.bai37_quan_ly_sinh_vien;

public class SinhVien {
    private long maSoSinhVien;
    private String hoVaTen;
    private NgaySinh ngaySinh;
    private double diemTrungBinh;
    private Lop lop;

    public SinhVien(long maSoSinhVien,String hoVaTen,NgaySinh ngaySinh, double diemTrungBinh,Lop lop){
        this.maSoSinhVien=maSoSinhVien;
        this.hoVaTen=hoVaTen;
        this.ngaySinh=ngaySinh;
        this.diemTrungBinh=diemTrungBinh;
        this.lop=lop;
    }

    public double getDiemTrungBinh() {
        return this.diemTrungBinh;
    }

    public long getMaSoSinhVien() {
        return this.maSoSinhVien;
    }

    public Lop getLop() {
        return this.lop;
    }

    public NgaySinh getNgaySinh() {
        return this.ngaySinh;
    }

    public String getHoVaTen() {
        return this.hoVaTen;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public void setLop(Lop lop) {
        this.lop = lop;
    }

    public void setMaSoSinhVien(long maSoSinhVien) {
        this.maSoSinhVien = maSoSinhVien;
    }

    public void setNgaySinh(NgaySinh ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public String layTenKhoa(){
        return this.getLop().getTenKhoa();
    }
    public boolean kiemTraDiemTrungBinhlonHon5(){
        return this.getDiemTrungBinh()>5;
    }
    public boolean kiemTraTrungNgaySinh(SinhVien sinhVienKhac){
        return this.ngaySinh.equals(sinhVienKhac.ngaySinh);

    }
}
