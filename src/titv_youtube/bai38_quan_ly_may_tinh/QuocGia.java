package titv_youtube.bai38_quan_ly_may_tinh;

public class QuocGia {
    private String maQuocGia;
    private String tenQuocGia;

    public QuocGia(String maQuocGia,String tenQuocGia) {
        this.maQuocGia=maQuocGia;
        this.tenQuocGia=tenQuocGia;
    }

    public void setTenQuocGia(String tenQuocGia) {
        this.tenQuocGia = tenQuocGia;
    }

    public String getTenQuocGia() {
        return this.tenQuocGia;
    }

    public String getMaQuocGia() {
        return this.maQuocGia;
    }

    public void setMaQuocGia(String maQuocGia) {
        this.maQuocGia = maQuocGia;
    }
}
