package ru.vsu.cs.util.steblev_d_v.oop.tasks.task16;

import java.util.*;

// Готов
public class ReadOnlyList<T> implements List<T> {

    private List<T> list;

    public ReadOnlyList(List<T> list) {
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
        return list.contains(o);
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
        throw new UnsupportedOperationException("List is readOnly!");
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("List is readOnly!");
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return list.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        throw new UnsupportedOperationException("List is readOnly!");
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        throw new UnsupportedOperationException("List is readOnly!");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("List is readOnly!");
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("List is readOnly!");

    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("List is readOnly!");
    }

    @Override
    public T get(int index) {
        return list.get(index);
    }

    @Override
    public T set(int index, T element) {
        throw new UnsupportedOperationException("List is readOnly!");
    }

    @Override
    public void add(int index, T element) {
        throw new UnsupportedOperationException("List is readOnly!");
    }

    @Override
    public T remove(int index) {
        throw new UnsupportedOperationException("List is readOnly!");
    }

    @Override
    public int indexOf(Object o) {
        return list.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return list.lastIndexOf(o);
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
    public List<T> subList(int fromIndex, int toIndex) {
        return list.subList(fromIndex, toIndex);
    }

    @Override
    public String toString() {
        return "readOnlyList = " + list;

    }
}