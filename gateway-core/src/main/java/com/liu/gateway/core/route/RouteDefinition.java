package com.liu.gateway.core.route;


import com.liu.gateway.core.route.predicate.PredicateDefinition;

import java.net.URI;
import java.util.List;

public class RouteDefinition {
    private String id;
    private URI uri;
    private List<PredicateDefinition> predicates;
    private int order;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public URI getUri() {
        return uri;
    }

    public void setUri(URI uri) {
        this.uri = uri;
    }

    public List<PredicateDefinition> getPredicates() {
        return predicates;
    }

    public void setPredicates(List<PredicateDefinition> predicates) {
        this.predicates = predicates;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "RouteDefinition{" +
                "id='" + id + '\'' +
                ", uri=" + uri +
                ", predicates=" + predicates +
                ", order=" + order +
                '}';
    }
}
