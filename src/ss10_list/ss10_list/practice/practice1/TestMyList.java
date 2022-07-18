package ss10_list.practice.practice1;

public class TestMyList {
    public static void main(String[] args) {
        MyList<Integer> listInteger =new MyList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);

        System.out.println("element 1:"+listInteger.get(0));
        System.out.println("element 2:"+listInteger.get(1));
        System.out.println("element 3:"+listInteger.get(2));
        System.out.println("element 4:"+listInteger.get(3));
        System.out.println("element 5:"+listInteger.get(4));


//        System.out.println("element 7:"+listInteger.get(6));
    }
}



