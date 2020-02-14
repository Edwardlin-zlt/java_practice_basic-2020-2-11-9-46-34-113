package com.thoughtworks;

public enum Suit {
    SPADE("黑桃"),
    HEART("红桃"),
    DIAMOND("梅花"),
    CLUB("方片");

    private final String name;

    public String getName() {
        return name;
    }

    Suit(String name) {
        this.name = name;
    }
}
