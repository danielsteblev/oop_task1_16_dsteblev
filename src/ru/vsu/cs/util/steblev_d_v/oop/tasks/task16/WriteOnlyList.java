package ru.vsu.cs.util.steblev_d_v.oop.tasks.task16;

import java.util.*;

public class WriteOnlyList<T> implements List<T> {

    private List<T> list;

    public WriteOnlyList(List<T> list) {
        this.list = list;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return this.isEmpty();
    }

    @Override
    // Включает ли список в себя данный элемент
    public boolean contains(Object o) {
        throw new UnsupportedOperationException("List is readOnly!");
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }

    @Override
    public Object[] toArray() {
        return list.toArray();
    }


    @Override
    // Задать вопрос
    public <T1> T1[] toArray(T1[] a) {
        // toDO
        return null;
    }

    @Override
    public boolean add(T t) {
        return list.add(t);
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("List is WriteOnly!");
    }

    @Override
    // Проверка содержит ли список указанные элементы;
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("List is WriteOnly!");
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return list.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return list.addAll(index, c);
    }

    @Override
    // Задать вопрос !
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("List is writeOnly!");
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("List is writeOnly!");

    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public T get(int index) {
        throw new UnsupportedOperationException("List is writeOnly!");
    }

    @Override
    public T set(int index, T element) {
       return list.set(index, element);
    }

    @Override
    public void add(int index, T element) {
        list.add(index, element);
    }

    @Override
    public T remove(int index) {
        throw new UnsupportedOperationException("List is writeOnly!");
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException("List is writeOnly!");
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("List is writeOnly!");
    }

    @Override
    public ListIterator<T> listIterator() {
        return list.listIterator();
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return list.listIterator();
    }

    @Override
    // Возврат части от...до.
    public List<T> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("List is writeOnly!");
    }

    @Override
    public String toString() {
        return "writeOnlyList = " + list;

    }
}