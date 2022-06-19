package titv_youtube.bai35_quan_ly_sach;

public class Main {
    public static void main(String[] args) {
        NgaySinh ngaySinh = new NgaySinh(22,2,1990);
        TacGia tacGia = new TacGia("Văn Cao",ngaySinh);
        Sach sach = new Sach("Văn học",10,2010,tacGia);

        NgaySinh ngaySinh1 = new NgaySinh(17,4,2010);
        TacGia tacGia1 = new TacGia("Xuân Diệu",ngaySinh);
        Sach sach1 = new Sach("Thơ",10,2010,tacGia);

        sach1.inTenSach();

        System.out.println("Kiểm tra năm xuất bản của sách Văn học và Thơ có cùng không :"+sach.kiemTraCungNam(sach1));

        System.out.println("Số tiền sau khi giảm 10% của sách Văn học : "+sach.giaSauKhiGiam(10));

    }

}
