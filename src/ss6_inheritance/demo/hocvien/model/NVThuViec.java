package ss6_inheritance.demo.hocvien.model;

public class NVThuViec extends HocVien {
    private long idNV;

    public NVThuViec() {
    }

    public NVThuViec(String name, String age,long idNV) {
        super(name, age);
        this.idNV=idNV;
    }
    public long getIdNV() {
        return this.idNV;
    }
    public void setIdNV(long idNV) {
        this.idNV = idNV;
    }
    public void make(){
        System.out.println("make");
    }
    @Override
    public String toString() {
        return "NVThuViec{" +
                "idNV=" + idNV
                +super.toString()+'}';
    }
}
