package ss6_inheritance.demo.hocvien.controller;

import ss6_inheritance.demo.hocvien.model.HocVien;
import ss6_inheritance.demo.hocvien.model.NVThuViec;
import ss6_inheritance.demo.hocvien.model.SinhVien;

public class MainController {
    public static void main(String[] args) {
        HocVien hocVien = new HocVien();
        //điều kiện để ép kiểu
        if(hocVien instanceof SinhVien){
            SinhVien sinhVien = (SinhVien) hocVien;
        }
        HocVien[] dsHocVien = new HocVien[2];
        dsHocVien[0]= new SinhVien();
        dsHocVien[1]= new NVThuViec();

        for(int i =0;i<dsHocVien.length;i++){
            if(dsHocVien[i] instanceof SinhVien){
                SinhVien sinhVien = (SinhVien) dsHocVien[i];
                sinhVien.run();
            }
            else if(dsHocVien[i] instanceof NVThuViec){
                NVThuViec nvThuViec = (NVThuViec) dsHocVien[i];
                nvThuViec.make();
            }
        }
    }
}
