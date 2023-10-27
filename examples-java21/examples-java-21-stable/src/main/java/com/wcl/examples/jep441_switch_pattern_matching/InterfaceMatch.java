package com.wcl.examples.jep441_switch_pattern_matching;

public class InterfaceMatch {

    public int matchObject(final Employee employee) {
        return switch (employee) {
            case Director director -> director.getSalary() + director.getDividends();
            case Manager manager -> manager.getSalary() + manager.getBonus();
            case Worker worker -> worker.getSalary() + worker.getOvertime();

            case null -> throw new IllegalArgumentException("No employee supplied");
            default -> 0;
        };
    }
}
