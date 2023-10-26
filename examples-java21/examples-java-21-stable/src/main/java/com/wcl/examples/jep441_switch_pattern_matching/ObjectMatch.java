package com.wcl.examples.jep441_switch_pattern_matching;

public class ObjectMatch {
    private static final String MATCH_TEXT = "%s passed in";
    public String matchObject(Object obj) {
        return switch (obj) {
            case Integer intValue -> String.format("%s passed in","Integer");
            case null -> String.format("%s passed in","Null");
            default -> String.format("%s passed in",obj.getClass().getName());
        };
    }
}
