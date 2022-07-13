package ss10_list.exercise.exercise1.model;

public class MyList<E> {
    protected int capacity;
    protected   int size = 0;
    public  final  int DEFAULT_CAPACITY = 10;
    Object elements[];

    public MyList() {
         elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getDEFAULT_CAPACITY() {
        return DEFAULT_CAPACITY;
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }
}

