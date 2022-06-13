package ss3_array_method;

public class demo1 {
     static int []myArray ;
     static int myArray1[];
     static  String myArray2[] = {"a","b","c"};

    public static void main(String[] args) {
        myArray = new int [5];

        System.out.println(myArray);//Trả về địa chỉ của mảng
        System.out.println(myArray[0]);// 0 không vì chưa khởi tại giá trị mặc định trả về kiểu mặc định của kiểu dữ liệu khai báo
        System.out.println(myArray.length);//Trả về độ dài của mảng
        myArray[5]= 2;//Lỗi vì kích full kích thước

    }
}
