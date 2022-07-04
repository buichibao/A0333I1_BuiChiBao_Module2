package ss2_loop.ViDu;

public class ViDu2_vonglapforeach {
    public static void main(String[] args) {
        int A[] ={1,2,3,4,5,6};
        //duyệt mảng theo for
        for(int i =0;i<A.length;i++){
            System.out.println("A["+i+"] = "+A[i]);
        }
        //duyệt theo for each
        int i = 0;
        for(int element : A ){
            System.out.println("element "+i+" = "+element);
            i++;
        }
    }

}
