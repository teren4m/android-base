package com.github.teren4m.base.mvvm;

import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;

import java.util.ArrayList;
import java.util.List;

public class ListLiveData<T> extends LiveData<List<T>> {

    public ListLiveData() {
        this(100);
    }

    public ListLiveData(int initialCapacity) {
        setValue(new ArrayList<T>(initialCapacity));
    }

    public void add(List<T> items) {
        if (getValue() != null && items != null) {
            getValue().addAll(items);
            setValue(getValue());
        }
    }

    public void add(T item) {
        if (getValue() != null && item != null) {
            getValue().add(item);
            setValue(getValue());
        }
    }

    public void clear() {
        if (getValue() != null) {
            getValue().clear();
            setValue(getValue());
        }
    }

    @Override
    public void setValue(List<T> value) {
        super.setValue(value);
    }

    @Nullable
    @Override
    public List<T> getValue() {
        return super.getValue();
    }
}