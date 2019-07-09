package com.jalfonso.containercontextimpl.filter.logicalpredicate;

import com.jalfonso.containercontextimpl.filter.FilterContainerImpl;
import com.jalfonso.context.filter.logicaloperation.ILogicalIPredicate;

import java.util.List;

/**
 * The type Logical operation.
 */
public abstract class LogicalPredicate extends FilterContainerImpl implements ILogicalIPredicate<FilterContainerImpl> {

    private List<FilterContainerImpl> predicates;

    @Override
    public List<FilterContainerImpl> getPredicates() {
        return predicates;
    }

    @Override
    public void setPredicates(final List<FilterContainerImpl> predicates) {
        this.predicates = predicates;
    }
}
