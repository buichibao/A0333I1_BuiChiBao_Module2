package ss15_exception_debug.pratice.NumberFormatException;

public class CalculationExample {
    public  void calculate(int x,int y){
        try{
            int a = x + y;
            System.out.println("Tổng : "+a);
            int b = x-y;
            System.out.println("Hiệu : "+b);
            int c = x*y;
            System.out.println("Tích : "+c);
            int d = x / y;


            System.out.println("Thương: "+d);
        }catch (Exception e){
            System.err.println("Xảy ra ngoại lệ "+e.getMessage());
        }
    }
}
