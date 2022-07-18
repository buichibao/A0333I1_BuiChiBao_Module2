package ss5_access_modifier_static_get_set.demo.Studen;

public class Student {
    int id;
    private String name;
    static  String college;
    private double score;
    //static String college ="Bách Khoa Đà Nẵng";//c1 khởi tạo giá trọ cho biến static
    static {
        college = "Bách Khoa Đà Nẵng";
    }
   static int count =0;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        count++;
    }

    public Student(){

    }
    public Student(double score){
        this.score=score;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public  void setScore (double score){
        if(score<0||score>10){
            System.out.println("Nhập điểm sai");
        }else{
            this.score=score;
        }
    }

    /**
     * This is method disPlay
     */
     public void  disPlay(){
        int a;//Biến cục bộ
        System.out.printf("%d - %s- %s\n",id,name,college);
    }
}
