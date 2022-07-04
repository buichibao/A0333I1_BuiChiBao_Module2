package ss2_loop.ViDu;

public class ViDu_vonglaplongnhau {
    public static void main(String[] args) {
        System.out.println(" Bảng cửu chưởng");
        for(int i=1 ;i<=9;i++){
            System.out.print("  ");
            System.out.print(" "+i);
        }
        System.out.println("\n-----------------------------------");
        for(int i =1;i<=9;i++){
            System.out.print(i+" |");
            for (int j = 1; j <=9 ; j++) {
                System.out.printf("%4d",+i*j);
            }
            System.out.println();
        }
    }
}
