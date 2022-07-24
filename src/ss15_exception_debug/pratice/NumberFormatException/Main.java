package ss15_exception_debug.pratice.NumberFormatException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập x :");
        int x = scanner.nextInt();
        System.out.println("Hãy nhậy y :");
        int y = scanner.nextInt();

        CalculationExample calculationExample = new CalculationExample();
        calculationExample.calculate(x,y);
    }
}
