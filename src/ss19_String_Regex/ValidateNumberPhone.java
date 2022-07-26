package ss19_String_Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNumberPhone {
    private static  final Scanner SCANNER = new Scanner(System.in);
    private static Pattern pattern;
    public static  void compileNumber(){
        String numberPhone = "^[(][0-9]{2}[)][-][0][0-9]{9}$";
        pattern =Pattern.compile(numberPhone);
    }
    public static boolean valueNumber(String string){
        Matcher matcher = pattern.matcher(string);
        return  matcher.matches();
    }

    public static void main(String[] args) {
        System.out.print("Nhập số điện thoại cần kiểm tra :");
        String numberPhone = SCANNER.nextLine();
        compileNumber();
        if(valueNumber(numberPhone)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
