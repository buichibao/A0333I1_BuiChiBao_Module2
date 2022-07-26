package ss19_String_Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateName {
    private static Pattern pattern;
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void compileName(){
        String name = "^[A|C|P][0-9]{4}[G|H|I|K|L|M]$";
        pattern = Pattern.compile(name);
    }
    public static boolean validateName(String string){
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println("Nhập vào tên lớp cần kiểm tra");
        String className = SCANNER.nextLine();
        compileName();
        if(validateName(className)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
