package ss16_io_text.pratice.sum_file;

import java.io.*;

public class ReadFileExample {
    public void readFileText(String filePath){
        try {
            File file = new File(filePath);
            if (!file.exists()){
                throw  new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = "";
            int sum = 0;
            while ((line=bufferedReader.readLine())!=null){
                System.out.println(line);
                sum+=Integer.parseInt(line);
            }
            System.out.println("Tổng = "+sum);
        } catch (FileNotFoundException e) {
            System.err.println("File không tồn tại of nội dung có lỗi");;
        } catch (IOException e) {
            System.err.println("Lỗi nhập xuất");
        }catch (NumberFormatException e){
            System.err.println("Bạn phải nhập số");
        }
    }
}
