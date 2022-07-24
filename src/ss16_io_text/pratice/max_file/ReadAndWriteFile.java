package ss16_io_text.pratice.max_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath){
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);
            if(!file.exists()){
                throw  new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line ="";
            while ((line=bufferedReader.readLine())!=null){
                numbers.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        }catch (FileNotFoundException e) {
            System.out.println("File không tồn tại hoặc file bị lỗi");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numbers;
    }
    public void  writeFile(String filePath,int max){
        try{
            FileWriter fileWriter = new FileWriter(filePath,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Giá trịn lớn nhất là "+max+"\n");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
