package ss2_vong_lap_java;

import java.util.Arrays;

public class index1 {
    public static void main(String[] args) {
        String [] myArr = {"d","b","c","a"};
        //System.out.println(myArr); trả về địa chỉ chứ không phải xuất mảng
        //Những cách để in ra mảng
        for(int i =0;i<myArr.length;i++){
            System.out.print(myArr[i]+" ");
        }
        System.out.println("\n");
        int index =0;
        while(index<myArr.length){
            System.out.print(myArr[index]+" ");
            index++;
        }
        System.out.println("\n");
        for (String a: myArr) {
            System.out.print(a+" ");
        }
        System.out.println("\n");
        //Trong Java không sử dụng các hàm , nên phải dùng Arrays
        System.out.println(Arrays.toString(myArr));
        Arrays.sort(myArr);
        System.out.println(Arrays.toString(myArr));
    }
}
