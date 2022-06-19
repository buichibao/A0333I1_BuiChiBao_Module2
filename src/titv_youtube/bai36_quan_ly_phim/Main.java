package titv_youtube.bai36_quan_ly_phim;

public class Main {
    public static void main(String[] args) {
        NgayChieu ngayChieu = new NgayChieu(16,6,2022);
        HangSx hangSx = new HangSx("Holly","Mỹ");
        BoPhim boPhim = new BoPhim("Sát Thủ",2022,hangSx,50,ngayChieu);

        NgayChieu ngayChieu1 = new NgayChieu(1,5,2022);
        HangSx hangSx1 = new HangSx("Korea","Hàn quốc");
        BoPhim boPhim1 = new BoPhim("Người lạ",2020,hangSx,15,ngayChieu);

        System.out.println("Giá vé của boPhim có rẻ hơn boPhim1 không :"+boPhim.kiemTraGiaVeReHon(boPhim1));
        System.out.println("Hãng sx của phim boPhim :"+boPhim.layTenHangSanXuatPhim());
        System.out.println("Giá sau khi giảm 10% của bophim :"+boPhim.giaSauKhuyenMai(10));
    }
}
