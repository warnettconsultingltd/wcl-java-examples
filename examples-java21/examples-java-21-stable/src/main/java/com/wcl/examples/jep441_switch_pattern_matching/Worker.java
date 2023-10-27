package com.wcl.examples.jep441_switch_pattern_matching;

public class Worker implements Employee{
    @Override
    public int getSalary() {
        return 25000;
    }

    public int getOvertime() {
        return 40000;
    }
}
