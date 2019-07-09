package com.jalfonso.containercontextimpl.filter.predicate.basicpredicate;

import com.jalfonso.context.filter.predicate.basicpredicate.IBetween;

/**
 * The type Between.
 */
public class Between extends BasicPredicate implements IBetween {

    private String value1;

    @Override
    public String getValue1() {
        return this.value1;
    }

    @Override
    public void setValue1(final String value1) {
        this.value1 = value1;
    }
}
