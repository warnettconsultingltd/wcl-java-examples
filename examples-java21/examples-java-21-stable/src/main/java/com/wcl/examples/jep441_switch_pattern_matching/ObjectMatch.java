package com.wcl.examples.jep441_switch_pattern_matching;

public class ObjectMatch {
    private static final String MATCH_TEXT = "%s passed in";
    public String matchObject(final Object obj) {
        return switch (obj) {
            case Integer intValue -> String.format(MATCH_TEXT,"Integer");
            case null -> String.format(MATCH_TEXT,"Null");
            default -> String.format(MATCH_TEXT,obj.getClass().getSimpleName());
        };
    }
}
