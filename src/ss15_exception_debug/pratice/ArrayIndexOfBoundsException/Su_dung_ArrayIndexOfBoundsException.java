package ss15_exception_debug.pratice.ArrayIndexOfBoundsException;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Su_dung_ArrayIndexOfBoundsException {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        do{

            try{ System.out.println("Vui lòng nhập chỉ số phần tử bất kì :");
                int x = scanner.nextInt();
                System.out.print("Giá trị của phần tử chỉ số "+ x + " là "+arr[x]);
                break;
            }catch (IndexOutOfBoundsException e){
                System.err.println("Chỉ số vượt quá giới hạn mảng");
            }catch (InputMismatchException e){
                scanner.nextLine();//xóa bộ nhớ đệm tránh tình trạng nhập vô hạn
                System.err.println("Bạn nhập chữ chứ không phải số");
            }
        }while(true);

    }
}
