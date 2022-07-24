package ss16_io_text.exrecise.doc_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
         List<QuocGia> strings = (List<QuocGia>) new QuocGia(readFile("src\\ss16_io_text\\exrecise\\doc_file\\quocGia.txt"));
         writeFile("src\\ss16_io_text\\exrecise\\doc_file\\tenQuocGia.txt",strings);

    }
    public static List<String> readFile(String path){
        List<String> stringList = new ArrayList<>();
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line="";
            while ((line=bufferedReader.readLine())!=null){
                stringList.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
         return stringList;
    }
    public static void writeFile(String path,List<QuocGia> strings){

        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (QuocGia s:strings) {
                bufferedWriter.write(s.getTen());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }catch (IOException e){
            e.getStackTrace();
        }

    }
}
