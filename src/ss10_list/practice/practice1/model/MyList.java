package ss10_list.practice.practice1.model;

import ss10_list.practice.practice1.service.impl.MyListService;

public class  MyList<E>  {
    protected   static  final int DEFAULT_CAPACITY = 10;
    protected int size = 0;
    protected Object[]  elements;

    public  MyList() {
        elements =  new Object[DEFAULT_CAPACITY];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }
}
