package ss4_class_obj.BaiTap.StopWatch;

import java.util.Random;

public class MainStopWatch {
    public static void main(String[] args) {
        MainStopWatch mainStopWatch = new MainStopWatch();
        StopWatch stopWatch = new StopWatch();
        int arr[]= new int[100000];
        Random random =new Random();
        for(int i =0;i<arr.length;i++){
            int randomNumber = random.nextInt(100000);
            arr[i]= randomNumber;
        }
        stopWatch.start();
        mainStopWatch.sort(arr);
        System.out.println(""+stopWatch.getElapsedTime());
    }
    void sort(int arr[]){
        int min;
        for (int i =0; i < arr.length; i++){
            min = i;
            for (int j = i+1; j< arr.length; j++){
                if (arr[j] < arr[min]){
                    min = j;
                    int tmp = arr[min];
                    arr[min] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
    }

}
