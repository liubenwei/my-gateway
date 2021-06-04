package com.liu.gateway.core.route.predicate;

import java.util.Map;

public class PredicateDefinition {
    private String name;
    private Map<String,String> args;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getArgs() {
        return args;
    }

    public void setArgs(Map<String, String> args) {
        this.args = args;
    }

    @Override
    public String toString() {
        return "PredicateDefinition{" +
                "name='" + name + '\'' +
                ", args=" + args +
                '}';
    }
}
