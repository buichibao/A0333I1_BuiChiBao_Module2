package ss16_io_text.exrecise.doc_file;

import java.util.List;

public class QuocGia {
    private int stt;
    private String id;
    private String ten;

    public QuocGia() {
    }

    public QuocGia(int stt, String id, String ten) {
        this.stt = stt;
        this.id = id;
        this.ten = ten;
    }



    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

}
