package com.jalfonso.containercontextimpl.filter.predicate.arraypredicate;

import com.jalfonso.containercontextimpl.ContextContainerImpl;
import com.jalfonso.context.filter.predicate.arraypredicate.IArrayPredicate;

import java.util.List;

/**
 * The type Array operation.
 */
public abstract class ArrayPredicate extends ContextContainerImpl implements IArrayPredicate {

    private String key;
    private List<String> array;

    @Override
    public String getKey() {
        return this.key;
    }

    @Override
    public void setKey(final String key) {
        this.key = key;
    }

    @Override
    public List<String> getArray() {
        return array;
    }

    @Override
    public void setArray(final List<String> array) {
        this.array = array;
    }
}
