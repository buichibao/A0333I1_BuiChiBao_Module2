package ss2_loop.BaiTap;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount ");
        int amount = Integer.parseInt(sc.nextLine());
        int count = 0;
        int i = 0;
        while (count < amount) {
            if (check(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }

    }
    public static boolean check(int number) {
        if (number < 2) {
            return false;
        } else {
            for (int k = 2; k <= Math.sqrt(number); k++) {
                if (number % k == 0) {
                    return false;

                }
            }
        }
        return true;
    }
}
