package com.jalfonso.containercontextimpl.filter.predicate.basicpredicate;

import com.jalfonso.context.filter.predicate.basicpredicate.ILikeCasePredicate;

/**
 * The type Like case operation.
 */
public abstract class LikeCasePredicate extends BasicPredicate implements ILikeCasePredicate {
    private Boolean ignoreCase = true;

    @Override
    public Boolean getIgnoreCase() {
        return ignoreCase;
    }

    @Override
    public void setIgnoreCase(final Boolean ignoreCase) {
        this.ignoreCase = ignoreCase;
    }

}
