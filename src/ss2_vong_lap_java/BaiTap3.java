package ss2_vong_lap_java;

public class BaiTap3 {
    public  static  boolean isPrimeNumber(int n){
        if(n<2){
            return false;
        }
        int a = (int)Math.sqrt(n);
        for(int i = 2;i<=a;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
         for(int i =2;i<=100;i++){
             if(isPrimeNumber(i)){
                 System.out.println(i+" ");
             }
         }
    }
}
