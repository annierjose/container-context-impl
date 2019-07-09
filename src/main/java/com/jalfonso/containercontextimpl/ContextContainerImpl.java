package com.jalfonso.containercontextimpl;

import com.jalfonso.containercontextimpl.filter.FilterContainerImpl;
import com.jalfonso.context.IContext;

/**
 * The type Context container.
 */
public class ContextContainerImpl implements IContext<FilterContainerImpl> {

    /**
     * The Filter.
     */
    FilterContainerImpl filter;

    @Override
    public FilterContainerImpl getFilter() {
        return filter;
    }

    @Override
    public void setFilter(final FilterContainerImpl filter) {
        this.filter = filter;
    }
}
