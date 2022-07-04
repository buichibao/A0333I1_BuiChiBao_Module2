package ss2_loop.BaiTap;

public class Prime {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            if (check(i)) {
                System.out.print(i + " ");
            }
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
