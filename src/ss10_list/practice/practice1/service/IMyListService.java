package ss10_list.practice.practice1.service;

import java.util.Objects;

public interface IMyListService<E> {
    void ensureCapa();
    void add(Object e);
    E get(int i);
}
