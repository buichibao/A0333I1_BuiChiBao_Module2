package ss10_list.exercise.exercise1.service.impl;

import ss10_list.exercise.exercise1.model.MyList;
import ss10_list.exercise.exercise1.service.IMyListService;

import java.util.Arrays;


public class MyListService<E> extends MyList implements IMyListService {
    MyList<Integer> elements = new MyList<>();
    @Override
    public void ensureCapa() {
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }

    @Override
    public void add(int index, Object e) {
        if(size == elements.length){
            ensureCapa();
        }
        for(int i =elements.length-1; i> index; i--){
            elements[i] = elements[i-1];
        }
        elements[index] = e;
        size++;
    }

    @Override
    public void remove(int index) {
        if(index<0  || index > elements.length){
            throw new IndexOutOfBoundsException("Error");
        }
        for(int i = index;i < elements.length-1;i++){
            elements[i] = elements[i+1];
        }
        elements[elements.length-1] = null;
        size--;
    }

    @Override
    public int size() {
        return  size;
    }

    @Override
    public MyList<E> clone() {
        return this;
    }

    @Override
    public boolean contains(Object o) {
        boolean check  = false;
        for(Object varible: elements){
            if(varible == o){
                check = true;
            }
        }
        return check;
    }

    @Override
    public int indexOf(Object o) {
        int poisiton = -1;
        for(int i =0;i < size; i++){
            if(elements[i].equals(o)){
                poisiton = i;
                break;
            }
        }
        return  poisiton;
    }

    @Override
    public void add(Object o) {
        if(size == elements.length){
            ensureCapa();
        }
        elements[size] = o;
        size++;
    }

    @Override
    public void ensureCapa(int minCapacity) {
        elements = Arrays.copyOf(elements,minCapacity);
    }
    public void clear(){
        for(int i =0; i < size; i++){
            elements[i] = null;
        }
    }

    @Override
    public void clear() {
        for(int i =0; i < size; i++){
            elements[i] = null;
        }
    }

    @Override
    public Object get(int index) {
        if(index < 0 || index > elements.length){
            throw new IndexOutOfBoundsException("err");
        }
        return (E) elements[index];
    }

}
}
