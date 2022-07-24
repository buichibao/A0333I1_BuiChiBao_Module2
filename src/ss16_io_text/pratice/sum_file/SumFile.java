package ss16_io_text.pratice.sum_file;

import ss16_io_text.pratice.sum_file.ReadFileExample;

import java.util.Scanner;

public class SumFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập đường link bạn cần đọc :");
        String path = scanner.nextLine();
        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);
    }
}
