package com.jalfonso.containercontextimpl.filter.predicate.basicpredicate;

import com.jalfonso.containercontextimpl.filter.FilterContainerImpl;
import com.jalfonso.context.filter.predicate.basicpredicate.IBasicPredicate;

/**
 * The type Basic operation.
 */
public abstract class BasicPredicate extends FilterContainerImpl implements IBasicPredicate {
    private String key;
    private String value;

    /**
     * Sets key.
     *
     * @param key the key
     */
    public void setKey(final String key) {
        this.key = key;
    }

    /**
     * Gets key.
     *
     * @return the key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * Sets value.
     *
     * @param value the value
     */
    public void setValue(final String value) {
        this.value = value;
    }

    /**
     * Gets value.
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }
}
