package ss10_list.practice.practice1.service.impl;

import ss10_list.practice.practice1.model.MyList;
import ss10_list.practice.practice1.service.IMyListService;

import java.util.Arrays;
import java.util.Objects;


public class MyListService<E> implements IMyListService<E>  {
//    private  static  final int DEFAULT_CAPACITY = 10;
//    private  int size = 0;
//    private Object[]  elements;
//
//    public MyListService() {
//        elements =  new Object[DEFAULT_CAPACITY];
//    }
//    MyListService [] myListService = new MyListService();
    MyList myList = new MyList();
    @Override
    public void ensureCapa() {
        int newSize = myList.getElements().length*2;
    }

    @Override
    public void add(Object e) {
        for (int i =0;i<myList.getSize();i++){
            if(myList.getSize() == myList.getElements().length){
                ensureCapa();
            }
            myList.getElements()[myList.getSize()+1]= e;
            int x = myList.getSize();
            x++;
            myList.setSize(x);
        }

    }
    @Override
    public E get(int i) {
        if (i> myList.getSize() || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        E a = (E) myList.getElements()[i];
        return  a;
    }
}
