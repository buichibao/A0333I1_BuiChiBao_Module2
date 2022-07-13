package ss10_list.exercise.exercise1.service;

public interface IMyListService<E> {
    void ensureCapa();

    void add(int index , E e);

    void remove(int index);

    int size() ;

    MyList<E> clone();

    boolean contains(E o);

    int indexOf(E o);

    void add(E o);

    void ensureCapa( int minCapacity);

    void clear();

    E get(int index);
 }
