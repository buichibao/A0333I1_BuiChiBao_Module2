package titv_youtube.bai37_quan_ly_sinh_vien;

public class Main {
    public static void main(String[] args) {
        Lop lop = new Lop("CNTT","DT4");
        NgaySinh ngaySinh = new NgaySinh(22,2,2001);
        SinhVien sinhVien = new SinhVien(102200163,"Bùi Chí Bảo",ngaySinh,6,lop);

        Lop lopA = new Lop("CNTT","DT3");
        NgaySinh ngaySinhA = new NgaySinh(9,8,2002);
        SinhVien sinhVienA = new SinhVien(102200124,"Dương Trí Đức",ngaySinh,6,lop);

        System.out.println("Tên khoa của sinh viên sinhvien :"+sinhVien.layTenKhoa());
        System.out.println("sinhVien có đậu không :"+sinhVien.kiemTraDiemTrungBinhlonHon5());
        System.out.println("2 sinh viên có ngày sinh giống nhau không :"+sinhVien.equals(sinhVienA));
    }
}
