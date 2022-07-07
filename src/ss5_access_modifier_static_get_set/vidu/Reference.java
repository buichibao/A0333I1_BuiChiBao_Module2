package ss5_access_modifier_static_get_set.vidu;

public class Reference {
    public static void main(String[] args) {
       Studen a = new Studen("bao");
       Studen b = new Studen("bui");
       swap(a,b);
        System.out.println("Name a = "+a.name);
        System.out.println("Name b = "+b.name);
    }
    public static  void swap(Studen a,Studen b){
        String temp = a.name;
        a.name=b.name;
        b.name= temp;
     }
}


