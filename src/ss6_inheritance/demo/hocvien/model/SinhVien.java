package ss6_inheritance.demo.hocvien.model;

public class SinhVien extends HocVien {
    private long idSV ;

    public SinhVien() {

    }

    public SinhVien(long idSV) {
        this.idSV = idSV;
    }
    public SinhVien(String name, String age, long idSV) {
        super(name, age);
        this.idSV = idSV;
    }
    public void run(){
        System.out.println("run");
    }

    public long getIdSV() {
        return idSV;
    }

    public void setIdSV(long idSV) {
        this.idSV = idSV;
    }
    @Override
    public String toString() {
        return "SinhVien{" +
                "idSV=" + idSV +super.toString()+
                '}';
    }
}
