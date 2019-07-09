package com.jalfonso.containercontextimpl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jalfonso.containercontextimpl.filter.logicalpredicate.And;
import com.jalfonso.containercontextimpl.filter.logicalpredicate.Or;
import com.jalfonso.containercontextimpl.filter.predicate.basicpredicate.Equal;
import com.jalfonso.containercontextimpl.filter.predicate.basicpredicate.NotEqual;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;

import static org.junit.Assert.assertEquals;

public class FilterImplTest {

    private String filter = "{filter: {predicateType: 'OR', predicates: [{predicateType: 'NE', key: 'id', value: 'id_1' },{ predicateType: 'AND', predicates: [{predicateType: 'EQ', key: 'note', value: 'note_2'}, {predicateType: 'EQ', key: 'name', value: 'note_2'}]}]}}";
    private ObjectMapper mapper = new ObjectMapper();

    @Before
    public void MapperInitialize() throws ParseException {
        mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        mapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
    }

    @Test
    public void test() throws IOException {
        ContextContainerImpl context = mapper.readValue(this.filter, ContextContainerImpl.class);
        assertEquals(Or.class, context.getFilter().getClass());
        assertEquals(2, ((Or) context.getFilter()).getPredicates().size());
        assertEquals(NotEqual.class, ((Or) context.getFilter()).getPredicates().get(0).getClass());
        assertEquals("id", ((NotEqual) ((Or) context.getFilter()).getPredicates().get(0)).getKey());
        assertEquals("id_1", ((NotEqual) ((Or) context.getFilter()).getPredicates().get(0)).getValue());
        assertEquals(And.class, ((Or) context.getFilter()).getPredicates().get(1).getClass());
        assertEquals(Equal.class, ((And) ((Or) context.getFilter()).getPredicates().get(1)).getPredicates().get(0).getClass());
        assertEquals(Equal.class, ((And) ((Or) context.getFilter()).getPredicates().get(1)).getPredicates().get(1).getClass());
    }
}
