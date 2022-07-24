package ss16_io_text.exrecise.coppy_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        writeFile("src\\ss16_io_text\\exrecise\\coppy_file\\dich.txt",readFile("src\\ss16_io_text\\exrecise\\coppy_file\\nguon.txt"));
    }
    public static List<String> readFile(String path){
        List<String> str = new ArrayList<>();
        File file = new File(path);
        try{
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            if(!file.exists()){
                throw  new FileNotFoundException();
            }
            String line="";
            int count=0;
            while ((line=bufferedReader.readLine())!=null){
                str.add(line);
                count+=line.length();
            }
            System.out.println(count);
            bufferedReader.close();
        }catch (Exception e){
            System.out.println(" File nguồn không tồn tại ");
        }
        return str;
    }
    public static void writeFile(String path,List<String> str){
        try{
            File file = new File(path);
            if(file.createNewFile()){
                throw new FileNotFoundException();
            }
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String s:str) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
