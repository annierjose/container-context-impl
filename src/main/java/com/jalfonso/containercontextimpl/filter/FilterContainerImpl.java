package com.jalfonso.containercontextimpl.filter;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.jalfonso.containercontextimpl.filter.logicalpredicate.And;
import com.jalfonso.containercontextimpl.filter.logicalpredicate.Or;
import com.jalfonso.containercontextimpl.filter.predicate.arraypredicate.In;
import com.jalfonso.containercontextimpl.filter.predicate.arraypredicate.NotIn;
import com.jalfonso.containercontextimpl.filter.predicate.basicpredicate.*;
import com.jalfonso.context.filter.IFilter;

/**
 * The type Filter container.
 */
@JsonSubTypes(value = {
        @JsonSubTypes.Type(name = "AND", value = And.class),
        @JsonSubTypes.Type(name = "OR", value = Or.class),
        @JsonSubTypes.Type(name = "EQ", value = Equal.class),
        @JsonSubTypes.Type(name = "NE", value = NotEqual.class),
        @JsonSubTypes.Type(name = "LIKE", value = Like.class),
        @JsonSubTypes.Type(name = "NOT_LIKE", value = NotLike.class),
        @JsonSubTypes.Type(name = "GT", value = GreaterThan.class),
        @JsonSubTypes.Type(name = "GTE", value = GreaterThanOrEq.class),
        @JsonSubTypes.Type(name = "BETWEEN", value = Between.class),
        @JsonSubTypes.Type(name = "LT", value = LessThan.class),
        @JsonSubTypes.Type(name = "LTE", value = LessThanOrEq.class),
        @JsonSubTypes.Type(name = "IN", value = In.class),
        @JsonSubTypes.Type(name = "NOT_IN", value = NotIn.class)
})
public abstract class FilterContainerImpl implements IFilter {
}
