package titv_youtube.bai31_phuong_thuc_trong_java;

public class Main {
    public static void main(String[] args) {
        HoaDonThanhToan hd = new HoaDonThanhToan("Trung Nguyen",100000,1.5);
        HoaDonThanhToan hd1 = new HoaDonThanhToan("ViNa",250000,3);
        System.out.println("Tổng tiền thanh toán "+hd.tinhTongTien());
        System.out.println("Tổng tiền thanh toán "+hd1.tinhTongTien());

        System.out.println("Khối lương cà phê khách mua lơn hơn 2kg :"+hd.kiemTraKhoiLuong(2));
        System.out.println("Khối lương cà phê khách mua lơn hơn 2kg :"+hd1.kiemTraKhoiLuong(2));

        System.out.println("Số tiền cà phê khách mua lơn hơn 500 :"+hd.kiemTraSoTien());
        System.out.println("Số tiền cà phê khách mua lơn hơn 500 :"+hd1.kiemTraSoTien());

        System.out.println("Hóa đơn hd được giảm số tiền là "+hd.giamGia(10));
        System.out.println("Hóa đơn hd1 được giảm số tiền là "+hd1.giamGia(10));

        System.out.println("Tổng số tiền của hd sau khi được giảm giá là : "+hd.soTienSauKhiGiamGia(10));
        System.out.println("Tổng số tiền của hd1 sau khi được giảm giá là : "+hd1.soTienSauKhiGiamGia(10));
    }
}
