package ru.vsu.cs.util.steblev_d_v.oop.tasks.task16;

import java.util.AbstractList;

public final class SingletonList<T> extends AbstractList<T> {
    private final T element;

    public SingletonList(T element) {
        this.element = element;
    }

    @Override
    public int size() {
        return 1;
    }

    @Override
    public T get(int index) {
        if(index != 0) {
            throw new IndexOutOfBoundsException("List in singleton! You can only get an element with index 0.");
        }
        return null;
    }
}
