package ss10_list.practice.practice1.service.impl;

import ss10_list.practice.practice1.service.IMyListTestSevice;

public class MyListTestService<E> implements IMyListTestSevice<E> {
    @Override
    public void test() {
        MyListService<Integer> listInteger = new MyListService<>();
        listInteger.add(3);
        listInteger.add(2);
        System.out.println("element 1: "+listInteger.get(0));
        System.out.println("element 2: "+listInteger.get(1));
    }
}
