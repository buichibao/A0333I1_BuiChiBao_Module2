package ss14_sort.practice;

public class SelectionSort {
    static int[]arr = {1,4,5,3,6,7,1};
    public static void main(String[] args) {
       selectSort(arr);
        for (int a:arr) {
            System.out.print(a+" ");
        }
    }
    public  static  void selectSort(int [] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
