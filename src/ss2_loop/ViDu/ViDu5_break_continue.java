package ss2_loop.ViDu;

public class ViDu5_break_continue {
    public static void main(String[] args) {
        for(int i =0;i<=10;i++){
            if(i==5){
                break;
            }
            System.out.println("i = "+i);
        }
        System.out.println("End loop 1");
        for(int i= 0;i<=10;i++){
            if(i==5){
                continue;
            }
            System.out.println("i = "+i);
        }
        System.out.println("End loop 2");
    }
}
