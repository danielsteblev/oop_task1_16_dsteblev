package ru.vsu.cs.util.steblev_d_v.oop.tasks.task16;

import java.util.ArrayList;
import java.util.Collection;

public class WriteOnlyList extends ArrayList {
    public WriteOnlyList(Collection c) {
        super(c);
    }

    @Override
    public Object get(int index) {
        throw new UnsupportedOperationException("Список является writeOnly!");
    }
}
