package ru.vsu.cs.util.steblev_d_v.oop.tasks.task16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class readOnlyArrayList extends ArrayList {
    public readOnlyArrayList(Collection c) {
        super(c);
    }

    @Override
    public Object set(int index, Object element) {
        throw new UnsupportedOperationException("Список является readOnly!");
    }

    @Override
    public boolean add(Object o) {
        throw new UnsupportedOperationException("Список является readOnly!");
    }
}
