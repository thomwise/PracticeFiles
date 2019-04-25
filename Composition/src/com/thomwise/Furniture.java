package com.thomwise;

public class Furniture {

    private Table table;
    private Couch couch;

    public Furniture(Table table, Couch couch) {
        this.table = table;
        this.couch = couch;
    }

    public Table getTable() {
        return table;
    }

    public Couch getCouch() {
        return couch;
    }
}
