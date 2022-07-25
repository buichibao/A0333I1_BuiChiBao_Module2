package ss16_io_text.exrecise.doc_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DocFile {
    public static List<String>  readFile(String path) throws IOException {
        List<String> list = new ArrayList<>();
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line= bufferedReader.readLine())!=null){
            list.add(line);
        }
        bufferedReader.close();
        return  list;
    }
    public  static List<QuocGia> readQuocGiaFile(String path) throws IOException {
        List<QuocGia> quocGiaList = new ArrayList<>();
        List<String> stringList= readFile(path);
        String[] info;
        for (String line: stringList) {
            info = line.split(",");
            quocGiaList.add(new QuocGia(Integer.parseInt(info[0]),info[1],info[2]));
        }
        return  quocGiaList;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(DocFile.readQuocGiaFile("src\\ss16_io_text\\exrecise\\doc_file\\QuocGia"));
    }
}
