package com.ar.design.pattern.builder.team;

public enum ColorENUM {

    RED, WHITE, BLUE, VIOLET;

    @Override
    public String toString() {
        return name().toLowerCase();
    }


}