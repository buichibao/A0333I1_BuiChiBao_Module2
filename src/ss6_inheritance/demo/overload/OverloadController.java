package ss6_inheritance.demo.overload;

public class OverloadController {
    static int add (int a , int b ){
        return a+b;
    }
    static  int add(int a,int b ,int c){
        return a+b+c;
    }
    static  int add(int...x){
        int total = 0;
        for (int i = 0; i <x.length ; i++) {
            total+=x[i];
        }
        return total;
    }
    public static void  main(String[] args) {
        int a = add(1,2);
        System.out.println(a);
        int b = add(1,2,3);
        System.out.println(b);
    }

}
