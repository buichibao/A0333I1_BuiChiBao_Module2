package ss8_clean_code_refactoring.practice.practice2;

public class FizzBuzz {

    public static String fizzBuzz(int number) {
        boolean isDivisible3 = (number % 3 == 0);
        boolean isDivisible5 = (number % 5 == 0);
        if (isDivisible3 && isDivisible5)
            return "FizzBuzz";

        if (isDivisible3)
            return "Fizz";

        if (isDivisible3)
            return "Buzz";

        return number + "";
    }
}
