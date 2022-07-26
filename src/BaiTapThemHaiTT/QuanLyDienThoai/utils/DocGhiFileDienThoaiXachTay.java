package BaiTapThemHaiTT.QuanLyDienThoai.utils;

import BaiTapThemHaiTT.QuanLyDienThoai.model.DienThoaiXachTay;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocGhiFileDienThoaiXachTay {
    public static List<String> docFile(String path){
        List<String> list = new ArrayList<>();
        try{
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line=bufferedReader.readLine())!=null){
                   list.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  list;
    }
    public static List<DienThoaiXachTay> docFileDienThoaiXachTay(String path){
        List<String> stringList = docFile(path);
        List<DienThoaiXachTay> dienThoaiXachTayList  = new ArrayList<>();
        String []info;
        for (String string:stringList) {
            info=string.split(",");
            dienThoaiXachTayList.add(new DienThoaiXachTay(info[0],Double.parseDouble(info[1]),Integer.parseInt(info[2]),info[3],info[4],info[5]));
        }
        return dienThoaiXachTayList;
    }
    public static void vietFile(String path,String data){
        try{
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void vietFileDienThoaiXachTay(String path,List<DienThoaiXachTay> dienThoaiXachTayList){
        StringBuilder data = new StringBuilder();
        for (DienThoaiXachTay dienThoaiXachTay:dienThoaiXachTayList) {
            data.append(dienThoaiXachTay.info());
        }
        vietFile(path,data.toString());

    }
}
