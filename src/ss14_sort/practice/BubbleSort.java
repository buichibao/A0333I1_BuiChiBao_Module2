package ss14_sort.practice;

public class BubbleSort {
    static int[]  arr = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    public static  void bubbleSort(int []list){
        boolean needNextPass = true;
        for (int k= 0; k<list.length-1&&needNextPass ; k++) {
            needNextPass = false;
            for (int i = 0; i <list.length-k-1 ; i++) {
                if(list[i]>list[i+1]){
                    int temp = list[i];
                    list[i] = list[i+1];
                    list[i+1]=temp;
                    needNextPass = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}
