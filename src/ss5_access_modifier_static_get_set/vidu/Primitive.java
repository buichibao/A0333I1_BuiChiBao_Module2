package ss5_access_modifier_static_get_set.vidu;

public class Primitive {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println(a+" và "+b+" trước khi hoán vị");
        swap(a,b);
        System.out.println(a+" và "+b+" sau khi hoán vị");
    }
    public static void swap (int first,int second){
        int temp = first;
        first=second;
        second=temp;
    }
}
