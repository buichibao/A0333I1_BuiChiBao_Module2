package ss4_class_object.BaiTap.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a;
        do{
            System.out.print("Nhập a :");
            a = sc.nextDouble();
            if(a==0){
                System.out.println("a phải khác 0 mời bạn nhập lại a!!");
            }
        }while (a==0);
        System.out.print("Nhập b :");
        double b = sc.nextDouble();
        System.out.print("Nhập c :");
        double c = sc.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double delta = quadraticEquation.getDiscriminant();

        if(delta>0){
            System.out.printf("Phương trình có 2 nghiệm %f và %f",quadraticEquation.getRoot1(),quadraticEquation.getRoot2());
        }else if(delta==0){
            System.out.printf("Phương trình có 1 nghiệm kép %f ",quadraticEquation.getRoot1());
        }else {
            System.out.println("Phương trình vô nghiệm");
        }



    }

}
